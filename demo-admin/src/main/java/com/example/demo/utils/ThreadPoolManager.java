package com.example.demo.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolManager {

  private static ThreadPoolExecutor threadPoolExecutor;

  static {
    // 核心线程数(线程池维护线程的最少数量)
    int corePoolSize = 5;

    // 线程池维护线程的最大数量
    int maximumPoolSize = 10;

    // 允许线程空闲时间
    long keepAliveTime = 5L;

    // 时间单位
    TimeUnit unit = TimeUnit.SECONDS;

    // 线程池使用的缓冲队列
    BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(2000);

    // 异常策略, 抛异常
    RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();

    // 线程工厂
    ThreadFactory threadFactory = new ThreadFactory() {
      @Override
      public Thread newThread(Runnable r) {
        return new Thread(r);
      }
    };

    threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit,
        workQueue, threadFactory, handler);
  }

  private ThreadPoolManager() {

  }

  public static void run(Runnable runnable) {
    threadPoolExecutor.execute(runnable);
  }
}
