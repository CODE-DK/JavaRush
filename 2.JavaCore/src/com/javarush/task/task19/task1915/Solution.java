package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream writer = new FileOutputStream(reader.readLine());
        reader.close();

        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();
        String s = outputStream.toString();

        System.setOut(printStream);

        System.out.println(s);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            writer.write((int) chars[i]);
        }
        writer.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

