package com.example.demo.utils;

import static java.lang.Thread.sleep;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MemcachedTest {

  public static void main(String[] args) throws InterruptedException {
    List<Integer> list= Arrays.asList(0,1,2);
    MemCachedUtil.set("mem", list, 1);
    System.out.println("mem=" + MemCachedUtil.get("mem"));
    MemCachedUtil.set("mem1", "mem1mem1");
    System.out.println("mem1=" + MemCachedUtil.get("mem1"));
    System.out.println("mem=" + MemCachedUtil.get("mem"));
    Date date = new Date(4000);
    MemCachedUtil.set("mem", "12e3232", date);
    sleep(4000);
    System.out.println("mem=" + MemCachedUtil.get("mem"));
    MemCachedUtil.flushAll();
    try {
      //Thread.sleep(3000);
      String mem = (String) MemCachedUtil.get("mem");
      System.out.println("mem=" + mem);
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
}
