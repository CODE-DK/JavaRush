package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
            array[i] = (int) Math.round(Math.random()*100);
        }
//        sort(array, 0, array.length - 1);
        sort2(array);
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
    public static void sort(int[] array, int start, int end) {
        if (start >= end) return;
        int i = start;
        int j = end;
        int op = i - (i - j)/2;

        while (i < j) {
            while ((i < op) && (array[i] <= array[op])) i++;
            while ((j > op) && (array[j] >= array[op])) j--;

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == op) op = j;
                else if (j == op) op = i;
            }
        }
        sort(array, start, op);
        sort(array, op + 1, end);
    }

    public static void sort2(int [] array){
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]){
                    flag = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
