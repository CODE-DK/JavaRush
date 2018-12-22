package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\DMITRIY\\Desktop\\input.txt");

        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (fileInputStream.available() > 0){
            int a = fileInputStream.read();
            if (!map.containsKey(a)){
                map.put(a, 1);
            }
            else map.put(a, map.get(a) + 1);
        }

        for (Map.Entry<Integer, Integer> outMap : map.entrySet()) {
            char a = (char) Integer.parseInt(outMap.getKey().toString());
            int b = outMap.getValue();
            System.out.println(a + " " + b);
        }

        fileInputStream.close();
    }
}
