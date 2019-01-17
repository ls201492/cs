package com.example.demo.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupCommon {
  private Document doc = null;

  public Elements query(String htmlString, String expression) {
    Elements elements = null;
    doc= Jsoup.parse(htmlString);
    if (doc != null) {
      elements = doc.select(expression);
    }
    return elements;
  }
}
