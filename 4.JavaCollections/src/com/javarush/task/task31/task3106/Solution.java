package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //сортируем кусочки zip файла
        Arrays.sort(args, 1, args.length);

        //создадим список входных потоков с именами из arrayOfNames
        ArrayList<FileInputStream> list = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            list.add(new FileInputStream(args[i]));
        }

        //создадим очередь потоков sis, входной поток zis и выходной поток fos.
        //создадим буффер, куда побайтово будем читать из zis.
        //перепишем побайтово в fos что прочитали.
        //потоки закроются автоматически.
        try(SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(list));
            ZipInputStream zis = new ZipInputStream(sis);
            FileOutputStream fos = new FileOutputStream(args[0])){
            byte[] buffer = new byte[1024 * 1024]; // буффер размером 1 Мб
            while (zis.getNextEntry() != null){
                int count = 0;
                while ((count = zis.read(buffer)) != -1){
                    fos.write(buffer, 0, count);
                }
            }
        }
    }
}
