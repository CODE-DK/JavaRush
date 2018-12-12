package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("exit")) break;

            try {
                Integer i = Integer.parseInt(s);
                if (i > 0 && i < 128){
                    Short j = Short.parseShort(s);
                    print(j);
                }
                else print(i);
            } catch (Exception a) {
                    try {
                        Double i = Double.parseDouble(s);
                        print(i);
                    }catch (Exception c){
                        print(s);
                    }
                }
            }
        }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
