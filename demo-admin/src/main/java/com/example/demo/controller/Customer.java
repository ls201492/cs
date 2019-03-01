package com.example.demo.controller;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Customer {
  /**
   * 队列名称
   */
  private static final String QUEUE_NAME = "QUEUE_test1";

  public static void main(String[] arge) throws IOException, TimeoutException {
    //1.获取连接
    Connection connection = ConnectionUtils.getConnection();
    //2.创建管道
    Channel channel = connection.createChannel();
    //3.获取消息
    Consumer consumer = new DefaultConsumer(channel){
      /**
       * @param consumerTag consumerTag
       * @param envelope 存放生产者相关信息
       * @param properties properties
       * @param body  消息实体
       * @throws IOException
       */
      @Override
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
        String msg = new String(body,"UTF-8");
        System.out.println("已接收到" + msg);
      }
    };
    //4.自动回复队列应答（RabbitMQ中的消息确认机制）
    channel.basicConsume(QUEUE_NAME, true, consumer);
    //5.关闭连接
    channel.close();
    connection.close();
  }

}
