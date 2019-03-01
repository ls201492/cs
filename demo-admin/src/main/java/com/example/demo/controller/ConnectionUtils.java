package com.example.demo.controller;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 获取MQ连接工具
 * @author liucong 2018/11/13
 */
public class ConnectionUtils {
  /**
   * 获取连接方法
   * @return connection
   */
  public static Connection getConnection() throws IOException, TimeoutException {
    //1.定义连接工厂
    ConnectionFactory connectionFactory = new ConnectionFactory();
    //2.设置服务地址
    connectionFactory.setHost("127.0.0.1");
    //3.设置端口(AMQP协议的端口，类似Mysql的3306)
    connectionFactory.setPort(5672);
    //4.设置账号，密码，vhost
    connectionFactory.setVirtualHost("/");
    connectionFactory.setUsername("guest");
    connectionFactory.setPassword("guest");
    //5.获得连接
    Connection connection = connectionFactory.newConnection();
    return connection;


}}
