package com.javarush.task.task09.task0923;

import java.util.Scanner;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner inputString = new Scanner(System.in);
        String vowels  = "", consonants = "";
        for (char i : inputString.nextLine().toCharArray()) {
            if (isVowel(i)) vowels += i + " ";
            else if (i != ' ') consonants += i + " ";
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}