package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(name.readLine());

        while (inputStream.available() > 0)
        {
            System.out.print((char) inputStream.read());
        }
        System.out.println();
        name.close();
        inputStream.close();
    }
}