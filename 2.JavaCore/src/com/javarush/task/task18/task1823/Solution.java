package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while (!s.equals("exit")){
            new ReadThread(s).start();
            s = reader.readLine();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            FileInputStream inputStream = null;
            try { inputStream = new FileInputStream(fileName); }
            catch (FileNotFoundException e) { }

            HashMap<Integer, Integer> map = new HashMap<>();
            try {
                while (inputStream.available() > 0){
                    int i = inputStream.read();
                    if (!map.containsKey(i)){
                        map.put(i, 1);
                    }else{
                        map.put(i, map.get(i) + 1);
                    }
                }
            }
            catch (IOException e) { }

            int maxValue = 0, maxKey = 0;
            for (Map.Entry<Integer, Integer> i : map.entrySet()) {
                if (maxValue < i.getValue()){
                    maxKey = i.getKey();
                    maxValue = i.getValue();
                }
            }
            resultMap.put(fileName, maxKey);
            try { inputStream.close(); }
            catch (IOException e) { }
        }
    }
}
