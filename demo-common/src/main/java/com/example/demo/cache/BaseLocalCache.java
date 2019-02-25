package com.example.demo.cache;

import com.example.demo.common.bean.response.BaseResponse;
import com.example.demo.srping.ApplicationContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public abstract class BaseLocalCache {

  private final static Logger logger = LoggerFactory.getLogger(BaseLocalCache.class);

  public abstract void invalidateAll();

  public void clearCache() {

    String cacheName = this.getClass().getSimpleName();
    logger.error("begin invalidate cache:" + cacheName);
    this.invalidateAll();
    logger.error("finlished invalidate cache:" + cacheName);
  }

  public static BaseResponse<String> clearCacheByName(String cacheName) {
    BaseResponse<String> resp = new BaseResponse<>();
    if (!StringUtils.isEmpty(cacheName)) {
      BaseLocalCache cache = (BaseLocalCache) ApplicationContextUtils.getBean(cacheName);
      if (null != cache) {
        resp.setData(cache.getClass().getSimpleName());
        cache.clearCache();
      }
    }
    return resp;
  }
}

