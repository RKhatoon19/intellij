package com.threadmodule;

import java.util.Date;

public class threadExercise /*extends Thread*/ {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread();
//        t.start();
//        t.run(); //auto invoked method
        long start = System.currentTimeMillis();
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
                Thread.sleep(5000);
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
