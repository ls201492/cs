package com.example.demo.utils;

import org.jsoup.select.Elements;

public class Test {

  public static String getTitle() {
    String result = "";
    String url = "http://admin.cunli.zhanyaa.com/doLogin.do?timeStamp=1547697163456&username=admin&password=cunli@zhanyaa2017%401002&url=&chk=true";
    HttpCommon httpCommon = new HttpCommon();
    String htmlString = httpCommon.getContentUrl(url, "utf-8");
    url = "http://admin.cunli.zhanyaa.com/admin/users/index.htm";
    htmlString = httpCommon.getContentUrl(url, "utf-8");
    JsoupCommon jsoup = new JsoupCommon();
    Elements elements = jsoup.query(htmlString, "title");
    result = elements.html();
    return htmlString;
  }

  public static void main(String[] args) {
    /*Long phoneNum = 15669070610L;
    String url = "https://www.51weixiao.com/www/user/get_pass";
    String sendCode = "https://www.51weixiao.com/www/user/send_verify_code";
    HttpClient httpClient = new HttpClient();
    try {
      for (int i = 0; i < 1000000; i++) {
        PostMethod postMethod = new PostMethod(sendCode);
        postMethod.setRequestBody("mobile=" + phoneNum + i + "&randomCode=" + "sv5csw");
        int statusCode = httpClient.executeMethod(postMethod);
        System.out.println("codesssssss" + statusCode);
        System.out.println("结果为" + postMethod.getResponseBodyAsString());
      }

    } catch (Exception e) {
      System.out.println(phoneNum);
    }*/

    String title = getTitle();
    System.out.println("标题是：" + title);
  }

}
