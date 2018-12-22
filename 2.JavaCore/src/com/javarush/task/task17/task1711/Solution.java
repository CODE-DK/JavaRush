package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String... args) throws ParseException {

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length / 3; i++) {

                        String name = args[1 + 3 * i];
                        String sex = args[2 + 3 * i];
                        String d = args[3 + 3 * i];

                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(d);

                        if (sex.equals("м")) {
                            allPeople.add(Person.createMale(name, date));
                        } else if (sex.equals("ж")) {
                            allPeople.add(Person.createFemale(name, date));
                        } else System.out.println("sex isn't support");

                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i < args.length / 4; i++) {

                        int id = Integer.parseInt(args[1 + 4 * i]);
                        String name = args[2 + 4 * i];
                        String s = args[3 + 4 * i];
                        String d = args[4 + 4 * i];

                        Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(d);
                        Sex sex = null;

                        if (s.equals("м")) {
                            sex = Sex.MALE;
                        } else if (s.equals("ж")) {
                            sex = Sex.FEMALE;
                        } else System.out.println("sex isn't support");

                        allPeople.get(id).update(name, sex, date);
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        int id = Integer.parseInt(args[i]);
                        try {
                            allPeople.get(id).delete();
                        } catch (Exception e) {
                            System.out.println("Fault in del func");
                        }
                    }
                }
                break;

            case "-i":

                for (int i = 1; i < args.length; i++) {

                    int id = Integer.parseInt(args[i]);
                    try {
                        System.out.println(allPeople.get(id));
                    } catch (Exception e) {
                        System.out.println("Fault in print func");
                    }
                }
                break;

            default:
                synchronized (allPeople) {
                    System.out.println("Invalid key");
                }
                break;
        }
    }
}
