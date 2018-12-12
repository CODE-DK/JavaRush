package com.javarush.task.task12.task1212;

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet
    {
        public abstract Pet getChild();

        public String getName() {
            return "Я - котенок";
        }
    }
}
