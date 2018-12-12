package com.javarush.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        Scanner inputStream = new Scanner(System.in);
        Date myDate = new Date(inputStream.nextLine());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(newDateFormat.format(myDate).toUpperCase());
    }
}
