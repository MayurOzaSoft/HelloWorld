package com.study.thread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThreadRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyThread() , "Thread 2");

        System.out.println("Start of Main Thread . . . ");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread1.wait();

        Thread.currentThread().join(4000);

        System.out.println("End of Main Thread . . . ");
    }
}
