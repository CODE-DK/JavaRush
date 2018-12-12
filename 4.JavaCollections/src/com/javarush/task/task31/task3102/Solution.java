package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    static List<String> list = new ArrayList<>();
    private static void someMethod(String root){
        for (File file : new File(root).listFiles()) {
            if (file.isDirectory()) someMethod(file.getAbsolutePath());
            else list.add(file.getAbsolutePath());
        }
    }
    public static List<String> getFileTree(String root) throws IOException {
        for (File file : new File(root).listFiles()) {
            if (file.isDirectory()) someMethod(file.getAbsolutePath());
            else list.add(file.getAbsolutePath());
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\DMITRIY\\Desktop\\FS_try2");
        getFileTree(file.getAbsolutePath());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
