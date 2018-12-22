package com.javarush.task.task22.task2209;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Arrays.sort;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        //...
        StringBuilder result = getLine("Киев", "Нью-Йорк", "Амстердам", "Вена" , "Мельбурн");
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {

        sort(words);
        newSort(words);

        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s + " ");
        }
        return sb;
    }

    private static void newSort(String[] words) {

        boolean flag = true;

        while (flag){
            for (int i = 0; i < words.length; i++) {
                flag
                for (int j = i; j < words.length; j++) {
                    String b = words[i].substring(words[i].length() - 1);

                    if (words[j].startsWith(b)){
                        String buffer = words[i];
                        words[i] = words[j];
                        words[j] = buffer;
                        flag = false;
                    }
                }
            }
        }
    }
}
