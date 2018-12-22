package com.javarush.task.task08.task0827;

import java.util.Date;

/* 

*/

public class Solution {
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        Date someDate = new Date(date);
        Date controlDate = new Date(someDate.getYear(), 1, 0);
        long c = (someDate.getTime() - controlDate.getTime())/(1000 * 60 * 60 * 24);
        return (c%2 == 0);
    }
}
