package com.javarush.task.task04.task0443;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String name = s.readLine();
        int a = Integer.parseInt(s.readLine());
        int b = Integer.parseInt(s.readLine());
        int c = Integer.parseInt(s.readLine());
        System.out.println("Меня зовут " + name + ".\nЯ родился "+ c + "." + b + "." + a);
    }
}
