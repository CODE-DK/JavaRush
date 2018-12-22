package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args)
    {
        readData();
    }

    public static void readData()
    {
            Scanner newScanner = new Scanner(System.in);
            ArrayList<Integer> newArrayList = new ArrayList<>();
        try{
            while(true){
                newArrayList.add(newScanner.nextInt());
            }
        }catch (InputMismatchException e){
            for (Integer i : newArrayList)
            {
                System.out.println(i);
            }
        }

    }
}
