package com.example.demo.filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ServletContextRequestLoggingFilter;

@Configuration
public class YuncaiRequestLoggingFilter  {

  private static final int MAX_PAYLOAD_LENGTH = 10000;

  @Autowired
  private CustomServletContextRequestLoggingFilter customServletContextRequestLoggingFilter;

  @Bean
  public ServletContextRequestLoggingFilter requestLoggingFilter() {
    ServletContextRequestLoggingFilter loggingFilter = customServletContextRequestLoggingFilter;
    loggingFilter.setIncludeClientInfo(true);
    loggingFilter.setIncludeQueryString(true);
    loggingFilter.setIncludePayload(true);
    loggingFilter.setIncludeHeaders(true);
    loggingFilter.setMaxPayloadLength(MAX_PAYLOAD_LENGTH);
    return loggingFilter;
  }

}
