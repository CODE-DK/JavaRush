package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
//      BufferedReader reader = new BufferedReader(new FileReader("E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt"));
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        while (reader.ready()){
            String[] strings = reader.readLine().split(" ");
            if (!map.containsKey(strings[0])) map.put(strings[0], Double.parseDouble(strings[1]));
            else map.put(strings[0], map.get(strings[0]) + Double.parseDouble(strings[1]));
        }

        reader.close();

        Double maxSum = 0d;
        TreeSet<String> set = new TreeSet<>();

        for (Map.Entry entry : map.entrySet()) {
            Double sum = (Double) entry.getValue();
            maxSum = maxSum > sum ? maxSum : sum;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(maxSum)) set.add((String) entry.getKey());
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
