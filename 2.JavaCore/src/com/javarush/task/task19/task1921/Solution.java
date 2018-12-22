package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedReader reader = new BufferedReader(new FileReader("E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt"));

        while (reader.ready()){
            String s = reader.readLine();

            String name = s.replaceAll("\\d", "");
            String numbers = s.substring(name.length());

            System.out.println(name);
//            System.out.println(numbers);

            String[] strings = numbers.split(" ");
            Date date = new Date(Integer.parseInt(strings[2]) - 1900, Integer.parseInt(strings[1]) - 1, Integer.parseInt(strings[0]));
            PEOPLE.add(new Person(name, date));
        }
        reader.close();
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthday());
        }
    }
}
