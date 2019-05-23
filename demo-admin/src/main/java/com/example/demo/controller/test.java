package com.example.demo.controller;


import com.example.demo.crawler.SaveToDBWebCrawler;
import com.example.demo.crawler.SaveToDBWebCrawlerFactory;
import com.example.demo.service.ContentService;
import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/admin/test")
public class test {

  private CrawlController controller;
  @Autowired
  private ContentService contentService;

  /**
   * 数据抓取
   */
  @RequestMapping(value = "/ajax/doClimb")
  @ResponseBody
  public Map<String, Object> doClimb(HttpServletRequest request, ModelMap model) {

    try {
      if (null == controller) {
        CrawlConfig config = new CrawlConfig();
        config.setCrawlStorageFolder("C:\\Code\\contentTwo");
        config.setMaxDepthOfCrawling(15);
        config.setIncludeHttpsPages(true);
        config.setUserAgentString(
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.131 Safari/537.36");

        PageFetcher pageFetcher = new PageFetcher(config);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
        controller = new CrawlController(config, pageFetcher, robotstxtServer);
        controller.addSeed("http://www.tiantianxiaoyao.com");
//        controller
//            .addSeed("http://www.fzahw.com/index.php?m=content&c=index&a=lists&catid=331");

        CrawlController.WebCrawlerFactory<SaveToDBWebCrawler> factory = new SaveToDBWebCrawlerFactory(
            contentService);

        controller.start(factory, 3);
      } else {
        controller.shutdown();

      }


    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return null;

  }
}
