package com.javarush.task.task16.task1632;

/**
 * Created by Dmitriy on 25.06.2017.
 */
public class Thread4 extends Thread implements Message{
    @Override
    public void run() {

    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}
