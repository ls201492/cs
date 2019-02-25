/**
 * Project Name:XinAn-Service File Name:LocalAreaNodeTreeCache.java Package
 * Name:com.xinan.service.cache Date:2018年4月28日下午4:52:37 Copyright (c) 2018, heyunliang@zhanyaa.com
 * All Rights Reserved.
 */

package com.example.demo.cache;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * ClassName:LocalAreaNodeTreeCache <br/>
 * Function: 区域节点缓存（机构节点），保存节点的父级节点、下级节点. <br/>
 * Date: 2018年4月28日 下午4:52:37 <br/>
 *
 * @author java
 * @version
 * @since JDK 1.6
 * @see
 */
@Service
public class LocalAreaNodeTreeCache extends BaseLocalCache {

  private final static Logger logger = LoggerFactory.getLogger(LocalAreaNodeTreeCache.class);

  @Override
  public void invalidateAll() {

  }
}
