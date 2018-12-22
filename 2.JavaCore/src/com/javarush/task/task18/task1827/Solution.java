package com.javarush.task.task18.task1827;

/* 
Прайсы
*/


import java.io.*;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        HashMap<Integer, Employer> crud = new HashMap<>();

        String filePath = "/Users/dkom91/Desktop/input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Employer employer = new Employer(reader.readLine(), Float.parseFloat(reader.readLine()), Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            
        }
    }
}
