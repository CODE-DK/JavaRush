package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<Object, Object> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        load(fileInputStream);
        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties o = new Properties();
        o.putAll(properties);
        o.store(outputStream, o.toString());
    }

    public void load(InputStream inputStream) throws Exception {
        Properties o = new Properties();
        o.load(inputStream);

        for (Map.Entry<Object, Object> objectEntry : o.entrySet()) {
            properties.put(objectEntry.getKey().toString(), objectEntry.getValue().toString());
        }
    }

    public static void main(String[] args) {

    }
}
