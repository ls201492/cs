package com.example.demo.srping;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

public class ApplicationContextUtils {

  private static ApplicationContext APPLICATIONCONTEXT;

  private ApplicationContextUtils() {}

  public static void setApplicationContext(ApplicationContext applicationContext) {
    APPLICATIONCONTEXT = applicationContext;
  }

  public static ApplicationContext getApplicationContext() {
    if (null == APPLICATIONCONTEXT) {
      return ContextLoader.getCurrentWebApplicationContext();
    }
    return APPLICATIONCONTEXT;
  }


  public static <T> T getBean(Class<T> clazz) {
    if (null == getApplicationContext()) {

      return null;
    }
    return getApplicationContext().getBean(clazz);
  }

  public static Object getBean(String name) {
    if (null == getApplicationContext()) {

      return null;
    }
    return getApplicationContext().getBean(name);
  }

  public static <T> T getBean(String name, Class<T> clazz) {
    if (null == APPLICATIONCONTEXT) {
      return null;
    }
    return APPLICATIONCONTEXT.getBean(name, clazz);
  }
}
