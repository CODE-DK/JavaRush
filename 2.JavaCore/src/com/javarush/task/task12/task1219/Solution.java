package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        void fly();
    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }


    public abstract class Human implements Run, Swim{

    }

    public abstract class Duck implements Fly, Run, Swim{

    }

    public abstract class Penguin implements Swim, Run{

    }

    public abstract class Airplane implements Fly, Run{

    }
}
