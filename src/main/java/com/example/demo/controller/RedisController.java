package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.utils.RedisUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
@Api(tags = "redis")
public class RedisController {

  @Autowired
  RedisUtils redisService;

  /**
   * 设置Str缓存
   */
  @RequestMapping(value = "setStr")
  public String setStr(String key, String val) {
    try {
      redisService.set(key, val);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "error";
    }
  }

  /**
   * 根据key查询Str缓存
   */
  @RequestMapping(value = "getStr")
  public Object getStr(String key) {
    return redisService.get(key);
  }


  /**
   * 根据key产出Str缓存
   */
  @RequestMapping(value = "delStr")
  public String delStr(String key) {
    try {
      redisService.remove(key);
      return "success";
    } catch (Exception e) {
      return "error";
    }
  }


  /**
   * 设置obj缓存
   */
  @RequestMapping(value = "setObj")
  public String setObj(String key, User user) {
    try {
      redisService.set(key, user);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "error";
    }
  }

  /**
   * 获取obj缓存
   */
  @RequestMapping(value = "getObj")
  public Object getObj(String key) {
    return redisService.get(key);
  }


  /**
   * 删除obj缓存
   */
  @RequestMapping(value = "delObj")
  public Object delObj(String key) {
    try {
      redisService.remove(key);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "error";
    }
  }
}
