package com.example.demo.filter;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.controller.SwaggerDemoController;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.exception.ExceptionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.ServletContextRequestLoggingFilter;

@Component
public class CustomServletContextRequestLoggingFilter  extends ServletContextRequestLoggingFilter {

  private static final Logger logger = LoggerFactory.getLogger(CustomServletContextRequestLoggingFilter.class);
  private void sendLogEmail(String exceptionMessage, String requestMessage) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Timestamp: ").append(System.currentTimeMillis()).append("\n").append("Time: ")
        .append(LocalDateTime.now().toString()).append("\n").append("Thread Id: ")
        .append(Thread.currentThread().getId()).append("\n").append("Thread Name: ")
        .append(Thread.currentThread().getName()).append("\n").append("Request: \n").append(requestMessage)
        .append("\n").append("Exception: \n").append(exceptionMessage).append("\n");
    logger.info(JSONObject.toJSONString(stringBuilder));
  }

  @Override
  protected void afterRequest(HttpServletRequest request, String message) {
    super.afterRequest(request, message);

      try {

//		        ExceptionMessage exceptionMessage = new ExceptionMessage();
//		        //TODO 异常消息发送
//		        exceptionSendComponent.sendExceptionMessage(exceptionMessage);

        sendLogEmail(null, message);

      } catch (Exception e) {
        logger.error("error", e);
      }
    }



}
