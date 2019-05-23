package com.example.demo.crawler;

import com.example.demo.service.ContentService;
import edu.uci.ics.crawler4j.crawler.CrawlController;

public class SaveToDBWebCrawlerFactory implements
    CrawlController.WebCrawlerFactory<SaveToDBWebCrawler> {

  private ContentService contentService;

  public SaveToDBWebCrawlerFactory(ContentService contentService) {
    this.contentService = contentService;
  }


  @Override
  public SaveToDBWebCrawler newInstance() throws Exception {
    return new SaveToDBWebCrawler(this.contentService);
  }
}
