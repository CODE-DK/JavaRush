package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(input.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(input.readLine()));
        input.close();

        while (reader.ready()){
            String s = reader.readLine();
            s = s.replace('.', '!');
            writer.write(s);
        }

        reader.close();
        writer.close();
    }
}
