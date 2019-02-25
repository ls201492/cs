/**
 * Project Name:XinAn-Common
 * File Name:UserAccessRequired.java
 * Package Name:com.xinan.common.srping
 * Date:2018年4月24日下午6:46:17
 * Copyright (c) 2018, heyunliang@zhanyaa.com All Rights Reserved.
 *
*/

package com.example.demo.srping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:UserAccessRequired <br/>
 * Function: 为接口提供是否需要登陆的统一校验处理，需要校验用户登陆的接口增加此注解即可 <br/>
 * Reason:	 为接口提供是否需要登陆的统一校验处理 <br/>
 * Date:     2018年4月24日 下午6:46:17 <br/>
 * @author   java
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAccessRequired {

}

