package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<>();
    static{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            while (reader.ready()){
                lines.add(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("короче жопа, файла нет");
        } catch (IOException e) {
            System.out.println("ваш вайл совсем не реди");
        }
    }
    public static void main(String[] args) {

        System.out.println(lines);
    }
}
