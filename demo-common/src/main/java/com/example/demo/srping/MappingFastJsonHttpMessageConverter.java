/**
 * Project Name:XinAn-Common
 * File Name:MappingFastJsonHttpMessageConverter.java
 * Package Name:com.xinan.common.srping
 * Date:2018年4月25日下午9:15:06
 * Copyright (c) 2018, heyunliang@zhanyaa.com All Rights Reserved.
 *
*/

package com.example.demo.srping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

/**
 * ClassName:MappingFastJsonHttpMessageConverter <br/>
 * Function: 对HTTP请求的统一HTTP转换处理 <br/>
 * Reason:	 对HTTP请求的统一HTTP转换处理 <br/>
 * Date:     2018年4月25日 下午9:15:06 <br/>
 * @author   java
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class MappingFastJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

  public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

  private SerializerFeature[] serializerFeature;

  public SerializerFeature[] getSerializerFeature() {
      if (null == serializerFeature)
      {
          return null;
      }
      return (SerializerFeature[])serializerFeature.clone();
  }

  public void setSerializerFeature(SerializerFeature[] serializerFeature) {
      this.serializerFeature = (SerializerFeature[])serializerFeature.clone();
  }

  public MappingFastJsonHttpMessageConverter() {
      super(new MediaType("application", "json", DEFAULT_CHARSET));
  }

  @Override
  public boolean canRead(Class<?> clazz, MediaType mediaType) {
      return true;
  }

  @Override
  public boolean canWrite(Class<?> clazz, MediaType mediaType) {
      return true;
  }

  @Override
  protected boolean supports(Class<?> clazz) {
      throw new UnsupportedOperationException();
  }

  @Override
  protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      int i;
      while ((i = inputMessage.getBody().read()) != -1) {
          baos.write(i);
      }
      return JSON.parseObject(baos.toString("UTF-8"), clazz);
  }

  @Override
  protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
      String jsonString = JSON.toJSONString(o, serializerFeature);
      OutputStream out = outputMessage.getBody();
      out.write(jsonString.getBytes(DEFAULT_CHARSET));
      out.flush();
  }
}

