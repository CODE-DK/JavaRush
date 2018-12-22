package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int value = 0;

        if (args[0].equals("-e")){
            value = 1;
        }else if (args[0].equals("-d")){
            value = -1;
        }else System.out.println("FAULT");

        try(FileInputStream fis = new FileInputStream(args[1])){
            while (fis.available() > 0){
                list.add(fis.read() + value);
            }
        } catch (IOException e) {

        }

        try(FileOutputStream fos = new FileOutputStream(args[2])){
            for (Integer integer : list) {
                fos.write(integer);
            }
        } catch (IOException e) {

        }
    }
}
