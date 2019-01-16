package com.example.demo.controller;

public class TestAccount {


    public static void main(String[] args) {
      Account account = new Account();
      TestAccount1 testAccount1 = new TestAccount1(account);
      testAccount1.start();
      TestAccount2 testAccount2 = new TestAccount2(account);
      testAccount2.start();

    }


}
