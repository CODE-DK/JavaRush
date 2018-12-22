package com.javarush.task.task16.task1632;

/**
 * Created by Dmitriy on 25.06.2017.
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            sleep(1);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
