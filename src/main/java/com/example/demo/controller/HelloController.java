package com.example.demo.controller;

import com.example.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Date;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
@Api(tags = "test")
public class HelloController {

  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
  public String sayWorld(@PathVariable("name") String name) {
    return "Hello " + name;
  }
  // @RequestParam 简单类型的绑定，可以出来get和post
  @RequestMapping(value = "/get")
  public HashMap<String, Object> get(@RequestParam String name) {
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("title", "hello eva");
    map.put("name", name);
    return map;
  }
  // @PathVariable 获得请求url中的动态参数
  @RequestMapping(value = "/get/{id}/{name}")
  public User getUser(@PathVariable int id, @PathVariable String name) {
    User user = new User();
    user.setId(id);
    user.setName(name);
    user.setDate(new Date());
    return user;
  }

  public static void main(String[] args) {

  }

}
