package com.javarush.task.task18.task1820;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream fileInputStream = new FileInputStream(a);
        FileOutputStream fileOutputStream = new FileOutputStream(b);

        ArrayList<Character> characters = new ArrayList<>();

        while (fileInputStream.available() > 0){
            characters.add((char) fileInputStream.read());
        }

        String data = "";
        for (Character character : characters) {
            if ((character.equals(' '))) {

                Integer integer = (int) Math.round(Double.parseDouble(data));
                data = integer.toString() + " ";
                fileOutputStream.write(data.getBytes());

                data = "";
            }
            char[] chars = {character};
            String memory = new String(chars);
            data += memory;
        }

        Integer integer = (int) Math.round(Double.parseDouble(data));
        data = integer.toString() + " ";
        fileOutputStream.write(data.getBytes());

        fileInputStream.close();
        fileOutputStream.close();
    }
}
