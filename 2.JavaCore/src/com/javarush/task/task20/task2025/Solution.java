package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Алгоритмы-числа
*/
public class Solution {
    private static long[][] POW = getPower();
    public static long[] getNumbers(long N) {
        long[] result;

        ArrayList<Long> all_arm = new ArrayList<>();
        ArrayList<Long> need_arm = new ArrayList<>();

        byte length = getLength(N);

        for (byte i = 1; i <= length; i++) {
            fillArmstrong(all_arm, i);
        }

        Collections.sort(all_arm);
        need_arm.add(0l);
        for (long arm : all_arm) {
            if (arm > N) break;
            need_arm.add(arm);
        }
        result = new long[need_arm.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = need_arm.get(i);
        }
        return result;
    }
    private static void fillArmstrong(ArrayList<Long> list, byte length) {
        // заполняем лист числами армстронга,
        // перебирая по уникальным последовательностям
        byte[] d = new byte[length];
        for (int i = 0; i < d.length; i++) {
            d[i] = 0;
        }
        while (nextUnique(0, d)) {
            long sum = getSum(d);
            if (getLength(sum) != length) continue;
            if(sum == getSum(sum)) list.add(sum);
        }
    }
    private static boolean nextUnique(int i, byte[] d) {
        // увеличивает указанный элемент массива
        // в соответствии с условием уникальности:
        // любая цифра не меньше предыдущей и не больше последующей.
        try {
            if (d[i] == 9) {
                if (!nextUnique(i + 1, d)) return false;
                d[i] = d[i+1];
            } else {
                d[i]++;
            }
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
    private static long getSum(long N) {
        // степенная сумма
        long sum = 0;
        byte pow = getLength(N);
        while (N > 0) {
            byte num = (byte) (N % 10);
            sum += POW[num][pow];
            N /= 10;
        }
        return sum;
    }
    private static long getSum(byte[] digit) {
        // степенная сумма
        long sum = 0;
        byte pow = (byte) digit.length;
        for (byte num : digit) {
            sum += POW[num][pow];
        }
        return sum;
    }
    private static byte getLength(long number) {
        //длина числа
        byte length = 0;
        while (number != 0) {
            number /= 10;
            length++;
        }
        return length;
    }
    private static long power(int n, int m) {
        //возведение в степень
        long pow = 1;
        for (int i = 0; i < m; i++)
            pow *= n;
        return pow;
    }
    private static long[][] getPower() {
        // массив степеней [0..9]^[0..19]
        long[][] pow = new long[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                pow[i][j] = power(i, j);
            }
        }
        return pow;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long[] array = getNumbers(Long.MAX_VALUE);
        long finish = System.currentTimeMillis() - start;
        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Time = %.3f sec\n", finish / 1000.0);
        System.out.printf("Memory = %.2f Mb\n", 1.0 * memory / 1024 / 1024);
//        System.out.printf("Count: %d\n", array.length);
        System.out.println(Arrays.toString(array));
    }
}
