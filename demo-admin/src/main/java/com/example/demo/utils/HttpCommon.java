package com.example.demo.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.jsoup.Jsoup;

/**
 * Created by dell on 2017/7/31.
 */
public class HttpCommon {

  /**
   * 发送http请求
   *
   * @param url       url地址
   * @param param     post 参数
   * @param type      请求的方式（主要是GET/POST）
   * @param encode    编码
   * @param paramType 请求的数据类型（application/json，application/html，application/xml）
   * @return 返回 请求的数据结果
   */
  private static String submitUrlContent(String url, Map<String, String> param, String type, String encode, String paramType, String json) {
    String result = "";
    String sparam = getUrl(param);
    if (!paramType.isEmpty() && paramType.toUpperCase() == "JSON") {
      sparam = json;
    }

    BufferedReader in = null;
    HttpURLConnection connection = null;
    try {
      URL realUrl = new URL(url);
      // 打开和URL之间的连接
      connection = (HttpURLConnection) realUrl.openConnection();
      // 设置通用的请求属性
      connection.setRequestProperty("accept", "image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/x-shockwave-flash, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
      connection.setRequestProperty("connection", "Keep-Alive");
      connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
      connection.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8");
      connection.setRequestProperty("contentType", encode.toUpperCase());
      connection.setDoOutput(true);
      connection.setDoInput(true);
      switch (paramType.toUpperCase()) {
        case "HTML":
          connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=" + encode.toUpperCase());
          break;
        case "JSON":
          connection.setRequestProperty("Content-Type", "application/json;charset=" + encode.toUpperCase());
          break;
      }
      connection.setRequestMethod(type.toUpperCase());

      // 建立实际的连接
      connection.connect();
      // 获取所有响应头字段
      OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream(), encode.toLowerCase());
      osw.write(sparam);
      osw.flush();
      osw.close();
      if (connection.getResponseCode() == 200) {
        in = new BufferedReader(new InputStreamReader(connection.getInputStream(), encode.toLowerCase()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
          result += inputLine;
        }
        in.close();
      }
    } catch (Exception e) {
      System.out.println("err");
    } finally {
      if (connection != null) {
        connection.disconnect();
      }
    }
    return result;
  }

  /**
   * 解析url后的参数
   *
   * @param param 存储 map 的参数
   * @return 返回解析出的字符串
   */
  private static String getUrl(Map<String, String> param) {
    String result = "";
    if (param == null || param.size() == 0) {
      result = "";
    } else {
      StringBuilder str = new StringBuilder();
      for (Map.Entry<String, String> entry : param.entrySet()) {
        str.append("&" + entry.getKey() + "=" + entry.getValue());
      }
      result = str.toString();
    }
    return result;
  }

  /**
   * 发送HTTP GET请求
   *
   * @param url    地址
   * @param encode 编码
   * @return 返回请求的数据结果
   */
  public static String getContentUrl(String url, String encode) {
    return submitUrlContent(url, null, "GET", encode, "HTML", "");
  }

  /**
   * 发送HTTP POST请求
   *
   * @param url    URL地址
   * @param encode 编码
   * @param map    参数
   * @return 返回请求的数据结果
   */
  public static String postContentUrl(String url, String encode, Map<String, String> map) {
    return submitUrlContent(url, map, "POST", encode, "HTML", "");
  }

  /**
   * 发送HTTP POST json 请求
   *
   * @param url    地址
   * @param encode 编码
   * @param json   json数据
   * @return 返回请求的数据值
   */
  public static String jsonContentUrl(String url, String encode, String json) {
    return submitUrlContent(url, null, "POST", encode, "JSON", json);
  }

}

