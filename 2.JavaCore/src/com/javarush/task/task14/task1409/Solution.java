package com.javarush.task.task14.task1409;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge a) {
        System.out.println(a.getCarsCount());
    }
}
interface Bridge{
    int getCarsCount();
    }
class WaterBridge implements Bridge{
        public int getCarsCount(){
            return 10;
        }
    }
class SuspensionBridge implements Bridge{
        public int getCarsCount(){
            return 20;
        }
    }

