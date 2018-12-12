package com.javarush.task.task32.task3213;

import java.io.*;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor Dpljr");
        System.out.println(decode(reader, -3));  //Hello Amigo
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (reader == null){
            return sb.toString();
        }else{
            int i = reader.read();
            while (i > 0){
                sb.append((char) (i + key));
                i = reader.read();
            }
        }
        return sb.toString();
    }
}
