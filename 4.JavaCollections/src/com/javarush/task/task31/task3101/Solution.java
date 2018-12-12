package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution {
    static ArrayList<File> fileSet = new ArrayList<File>();

    public static void main(String[] args) {
//        if (args.length == 0) return;
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        try {
            FileWriter writer = new FileWriter(allFilesContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//заполнение списка файлов рекурсивной функцией
        recursiveFill(path);
//сортировка списка файлов по возрастанию
        Collections.sort(fileSet, new MyFileComparator());
//открываю файл для чтения, еще один для записи
//копирую содержимое всех файлов поочередно в один
        BufferedReader reader;
        FileWriter targetWriter;
        try {
            targetWriter = new FileWriter(allFilesContent);
            for (File file: fileSet) {
                reader = new BufferedReader(new FileReader(file));
                while (reader.ready()) {
                    targetWriter.write(reader.readLine());
                }
                reader.close();
                targetWriter.write("\n");
            }
            targetWriter.close();
        } catch (IOException e) {
            System.out.println("Can't write file");
        }

    }
    //рекурсивный проход папки-параметра с занесение в список файлов length <= 50
    public static void recursiveFill(File source) {
        for (File component: source.listFiles()) {
            if (component.isDirectory())
                recursiveFill(component);
            else {
                if (component.length() > 50)
                    FileUtils.deleteFile(component);
                else
                    fileSet.add(component);
            }
        }
    }
    //компаратор для сортировку списка файлов по названию в порядке возрастания
    static class MyFileComparator implements Comparator<File> {
        @Override
        public int compare(File o1, File o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}
