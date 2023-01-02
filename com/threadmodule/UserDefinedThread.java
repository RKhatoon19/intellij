package com.threadmodule;

public class UserDefinedThread /*extends Thread*/  implements Runnable{
    @Override
    public void run() {
        int a=90;
        int b =10;

        System.out.println("Result : "+(a+b));
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        UserDefinedThread userDefinedthread=new UserDefinedThread();
        Thread t1 = new Thread(userDefinedthread); // for implements Runnable only
//        userDefinedthread.start(); // for extends Thread
        t1.start();

        //callable
    }
}
