package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            arrayList.add(Integer.parseInt(s.readLine()));
        }
        int count = 1, maxCount = 0;
        for (int i = 0; i < arrayList.size() - 1; i++)
        {
            if (arrayList.get(i).equals(arrayList.get(i + 1)))count ++;
            else if (!(arrayList.get(i).equals(arrayList.get(i + 1))))count = 1;
            if (maxCount < count) maxCount = count;
        }
        System.out.println(maxCount);
    }
}