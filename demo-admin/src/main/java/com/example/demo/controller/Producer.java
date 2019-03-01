package com.example.demo.controller;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {
  /**
   * 队列名称
   */
  private static final String QUEUE_NAME = "QUEUE_test";

  public static void main(String[] args) throws IOException, TimeoutException {
    //1.通过工具类获取MQ连接
    Connection connection = ConnectionUtils.getConnection();
    //2.从连接中创建通道

    Channel channel = connection.createChannel();
    //3.创建队列（让路由器知道往哪个队列里发送消息）
    boolean durable = false;
    boolean exclusive = false;
    boolean autoDelete = false;
    channel.queueDeclare(QUEUE_NAME, durable, exclusive, autoDelete,null);
    //4.创建消息
    String msg = "Hello QUEUE_test !!";
    //5.发送消息
    channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
    System.out.println(msg + "发送成功");
    //6.关闭连接
    channel.close();
    connection.close();
  }

}
