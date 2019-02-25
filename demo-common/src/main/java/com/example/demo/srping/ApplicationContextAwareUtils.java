/**
 * Project Name:XinAn-Common
 * File Name:ApplicationContextAwareUtils.java
 * Package Name:com.xinan.common.srping
 * Date:2018年4月26日下午7:02:13
 * Copyright (c) 2018, heyunliang@zhanyaa.com All Rights Reserved.
 *
*/

package com.example.demo.srping;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ClassName:ApplicationContextAwareUtils <br/>
 * Function: 用来通过SPING初始化从而为ApplicationContextUtils 进行初始化，方便应用中使用 ApplicationContext<br/>
 * Date:     2018年4月26日 下午7:02:13 <br/>
 * @author   java
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Component
public class ApplicationContextAwareUtils implements ApplicationContextAware {

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    ApplicationContextUtils.setApplicationContext(applicationContext);

  }

}

