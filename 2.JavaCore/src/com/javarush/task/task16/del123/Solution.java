package com.javarush.task.task16.del123;

public class Solution {
    public static void main(String[] args) {

        Thread.UncaughtExceptionHandler handler = new BlaBlaBla();

        Thread myNewThread1 = new NewThread(handler);
        Thread myNewThread2 = new NewThread(handler);

        myNewThread1.start();
        myNewThread2.start();

        myNewThread1.interrupt();
        myNewThread2.interrupt();
    }
}

class NewThread extends Thread{

    public NewThread(Thread.UncaughtExceptionHandler handler) {
        setUncaughtExceptionHandler(handler);
    }

    public void run(){
        try{
            sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException("123");
        }
    }
}

class BlaBlaBla implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() + " : " + e.getMessage());
    }
}