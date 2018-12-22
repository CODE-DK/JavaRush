package com.javarush.task.task05.task0532;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()) < 0 ? Integer.parseInt(reader.readLine()) : 0;
        int maximum = 0;
        int b = 0;
        for (int i = 0; i < a; i++)
        {
            b = Integer.parseInt(reader.readLine());
            if (maximum < b) maximum = b;
        }
        System.out.println(maximum);
    }
}
