package com.javarush.task.task16.task1632;

/**
 * Created by Dmitriy on 25.06.2017.
 */
public class Thread3 extends Thread {
    @Override
    public void run() {
        try {
            while (isAlive()){
                System.out.println("Ура");
                sleep(500);
            }
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}
