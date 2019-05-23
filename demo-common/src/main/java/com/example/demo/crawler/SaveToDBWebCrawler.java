package com.example.demo.crawler;


import com.example.demo.service.ContentService;
import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;

public class SaveToDBWebCrawler extends WebCrawler {

  private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SaveToDBWebCrawler.class);

  private static final Pattern FILE_ENDING_EXCLUSION_PATTERN = Pattern.compile(".*(\\.(" +
      "css|js" +
      "|bmp|gif|jpe?g|JPE?G|png|tiff?|ico|nef|raw" +
      "|mid|mp2|mp3|mp4|wav|wma|flv|mpe?g" +
      "|avi|mov|mpeg|ram|m4v|wmv|rm|smil" +
      "|pdf|doc|docx|pub|xls|xlsx|vsd|ppt|pptx" +
      "|swf" +
      "|zip|rar|gz|bz2|7z|bin" +
      "|xml|txt|java|c|cpp|exe" +
      "))$");
  private ContentService contentService;


  public SaveToDBWebCrawler(ContentService contentService) {
    this.contentService = contentService;
  }

  @Override
  public boolean shouldVisit(Page referringPage, WebURL url) {
    String href = url.getURL().toLowerCase();
    //return !FILE_ENDING_EXCLUSION_PATTERN.matcher(href).matches();
    return href.startsWith("http://www.tiantianxiaoyao.com");
  }

  @Override
  public void visit(Page page) {
    String url = page.getWebURL().getURL();
    logger.info("URL: " + url);

    page.setLanguage("zh-cn");
    if (page.getParseData() instanceof HtmlParseData) {

      HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
      Document doc = null;
      String htmlStr = htmlParseData.getHtml();
      try {
//        logger.info(htmlStr);
        doc = Jsoup
            .parse(htmlStr);
      } catch (Exception e) {
        e.printStackTrace();
      }
      String title = null;
      String author = null;
      String content = null;
      String html = null;
      String titleImg = null;
      String from = null;
      String xn = "";
      String nl = "";
      String jq = "";
      String dq = "";
      if (url.startsWith("http://www.tiantianxiaoyao.com")) {
        from = "天天逍遥网";
        title = doc
            .select(
                "body > div.wrapper > div > div.container > div > div.single-main > div:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2)")
            .text();
//        author = doc.select(
//            "")
//            .text();
        Elements ems = doc.select(
            "body > div.wrapper > div > div.container > div > div.single-main > div:nth-child(1) > div.view-photo");
        content = ems
            .text();

        xn = doc
            .select(
                "body > div.wrapper > div > div.container > div > div.single-main > div:nth-child(1) > table > tbody > tr:nth-child(10)")
            .text();
        nl = doc
            .select(
                "body > div.wrapper > div > div.container > div > div.single-main > div:nth-child(1) > table > tbody > tr:nth-child(7)")
            .text();
        dq = doc
            .select(
                "body > div.wrapper > div > div.container > div > div.single-main > div:nth-child(1) > table > tbody > tr:nth-child(3)")
            .text();
        jq = doc
            .select(
                "body > div.wrapper > div > div.container > div > div.single-main > div:nth-child(1) > table > tbody > tr:nth-child(11)")
            .text();
        html = ems.html();
        titleImg = ems.select("img").attr("src");
        if (StringUtils.isNotEmpty(titleImg)) {
          if (titleImg.startsWith("/")) {
            titleImg = "http://www.tiantianxiaoyao.com" + titleImg;
          } else if (!titleImg.startsWith("http")) {
            titleImg = url.substring(0, url.lastIndexOf("/") + 1) + titleImg;
          }

        }
      }

      logger.error("========URL: " + url);
      logger.error("========Title: " + title);
      logger.error("========titleImg: " + titleImg);
      logger.error("========Content: " + content);
      logger.error("========Html: " + html);
      if (StringUtils.isNotEmpty(content) && StringUtils.isNotEmpty(title)) {
        contentService
            .addContent(title.replace("\\n", "").trim(), xn, nl, jq, dq, titleImg, content);
      }

    }
  }
}
