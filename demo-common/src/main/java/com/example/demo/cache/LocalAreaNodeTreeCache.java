/**
 * Project Name:XinAn-Service File Name:LocalAreaNodeTreeCache.java Package
 * Name:com.xinan.service.cache Date:2018年4月28日下午4:52:37 Copyright (c) 2018, heyunliang@zhanyaa.com
 * All Rights Reserved.
 */

package com.example.demo.cache;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * ClassName:LocalAreaNodeTreeCache <br/> Function: 区域节点缓存（机构节点），保存节点的父级节点、下级节点. <br/> Date:
 * 2018年4月28日 下午4:52:37 <br/>
 *
 * @author java
 * @see
 * @since JDK 1.6
 */
@Service
public class LocalAreaNodeTreeCache extends BaseLocalCache {

  private final static Logger logger = LoggerFactory.getLogger(LocalAreaNodeTreeCache.class);
  /**
   * 缓存的使用可以大大提高程序的执行效率，但是如果缓存无法及时更新会导致脏读的情况
   */
  public static LoadingCache<String, String> cahceBuilder = CacheBuilder.newBuilder().maximumSize(1)
      .expireAfterWrite(1, TimeUnit.SECONDS)
      .refreshAfterWrite(2, TimeUnit.MILLISECONDS)
      .removalListener(new RemovalListener() {

        @Override
        public void onRemoval(RemovalNotification rn) {
          System.out.println(rn.getKey() + "被移除");
        }
      })
      .build(new CacheLoader() {
        @Override
        public Object load(Object o) throws Exception {
          String strProValue = "hello " + o + "!";
          System.out.println("%%%%%" + strProValue);
          return strProValue;
        }
      });

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    cahceBuilder.get("jerry");
    cahceBuilder.get("peida");
    Thread.sleep(1000);
    cahceBuilder.get("jerry1");
  }


  @Override
  public void invalidateAll() {

  }
}
