package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> outMap = new HashMap<>();
        outMap.put("1", "1");
        outMap.put("2", "2");
        outMap.put("3", "3");
        outMap.put("4", "4");
        outMap.put("4", "4");
        outMap.put("4", "4");
        outMap.put("4", "3");
        outMap.put("8", "2");
        outMap.put("9", "1");
        outMap.put("10", "1");
        return outMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
