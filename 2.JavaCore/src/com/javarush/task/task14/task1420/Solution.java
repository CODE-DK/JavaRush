package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
            int b = Integer.parseInt(a.readLine());
            int c = Integer.parseInt(a.readLine());
            if (b <=0 || c <=0) throw new NumberFormatException();
            System.out.println(nod(b, c));
    }
    private static int nod(int a, int b){
        int min = a < b ? a : b;
        int res = min;
        for (int i = 1; i <= min; i++) {
            if (a%i == 0 && b%i == 0)res = i;
        }
        return res;
    }
}
