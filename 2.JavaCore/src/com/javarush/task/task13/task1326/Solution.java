package com.javarush.task.task13.task1326;

/*
e:/input.txt
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

import static java.util.Collections.sort;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (inputStream.ready())
        {
            Integer iS = Integer.parseInt(inputStream.readLine());
            if (iS %2 == 0){
                arrayList.add(iS);
            }
        }
        sort (arrayList);
        for (Integer i : arrayList){
            System.out.println(i);
        }
        inputStream.close();
        reader.close();
    }
}