package com.example.demo.controller;

/**
 *@author leno
 *账户类
 *默认有余额，可以取款
 */

class Account {
  private float balance = 1000;
  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }
  /**
   *取款的方法需要同步
   *@param money
   */
  public synchronized void withdrawals(float money) {
    if (balance >= money) {
      System.out.println("被取走" + money + "元!");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      balance -= money;
    } else {
      System.out.println("对不起,余额不足!");
    }
  }
}
/**
 *@author leno
 *银行卡
 */

class TestAccount1 extends Thread {

  private Account account;
  public TestAccount1(Account account) {
    this.account = account;
  }
  @Override
  public void run() {
    account.withdrawals(800);
    System.out.println("余额为:" + account.getBalance() + "元!");

  }

}

/**
 *@authorleno
 *存折
 */

class TestAccount2 extends Thread {
  private Account account;
  public TestAccount2(Account account) {
    this.account = account;
  }

  @Override
  public void run() {
    account.withdrawals(700);
    System.out.println("余额为:" + account.getBalance() + "元!");
  }

}


