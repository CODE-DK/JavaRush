package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(input.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(input.readLine()));
        input.close();

        while (reader.ready()){
            String s = reader.readLine();
            String p = "!,-.:;?\n ";
            s = s.replaceAll("\\p{Punct}", "");
            writer.write(s);
        }

        reader.close();
        writer.close();
    }
}

/*
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
*/

/*
E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt
E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f2.txt
*/
