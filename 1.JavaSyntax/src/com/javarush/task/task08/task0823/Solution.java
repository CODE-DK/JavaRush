package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer(reader.readLine());
        for (int i = 0; i < s.length(); i++)
        {
            if (i == 0 || i == s.indexOf(" ", i - 1) + 1)
            {
                s.replace(i, i + 1, s.substring(i, i + 1).toUpperCase());
            }
        }
        System.out.println(s);
    }
}
