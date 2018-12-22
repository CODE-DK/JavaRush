package com.javarush.task.del_try_fast_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
//        double a = 5.49;
//        System.out.println(Math.round(a));
/**
 * input data. example
 */
    /*
        E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt
        E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f2.txt
    */
/**
 *  end input data. example
 */

/**
 *  example of
 Maximum number of repetitions
 in file
 */
    /*String fileName = "C:\\Users\\DMITRIY\\Desktop\\input.txt";

    FileInputStream inputStream = new FileInputStream(fileName);
    HashMap<Integer, Integer> map = new HashMap<>();
    while (inputStream.available() > 0){
        int i = inputStream.read();
        if (!map.containsKey(i)){
            map.put(i, 1);
        }else{
            map.put(i, map.get(i) + 1);
        }
    }
    int maxValue = 0, maxKey = 0;
    for (Map.Entry<Integer, Integer> i : map.entrySet()) {
        if (maxValue < i.getValue()){
            maxKey = i.getKey();
            maxValue = i.getValue();
        }
    }
    inputStream.close();
    }*/
/**
 *  end example of
 Maximum number of repetitions
 in file
 */

/**
 * example of replaceFirst
 */
    /*String c = b + "0" + a;
    long d = Long.parseLong(c);
    System.out.println( "+" + String.valueOf(d).replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1($2)$3-$4-$5"));
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("_");
    while (scanner.hasNext()){
        System.out.println(scanner.next());
    }*/
/**
 * end example of replaceFirst
 */

/**
 * example of split
 */
    /*String s = "+38(050)123-45-67";
    String[] s1 = s.split("\\D+");
    s = "+";
    for (int i = 0; i < s1.length; i++) {
        s += s1[i];
    }
    System.out.println(s);*/
/**
 * end example of split
 */


/**
 * another split example
 */
    /*String s = "Ivanov, Ivan";
    System.out.println(s.split(", ")[1]);
    System.out.println(s.split(", ")[0]);*/
/**
 * end another split example
 */

/**
 * счетчик слов. начало
 */
    /*FileReader fileReader = new FileReader("E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt");
    int count = 0;
    boolean flag = false;

    while (fileReader.ready()){
        int i = fileReader.read();
        if (i > 64 && i < 91 || i > 96 && i < 123){
            if (!flag){ count ++; }
            flag = true;
        }
        else { flag = false; }
    }*/
/**
 * счетчик слов. конец
 */

/**
 * повторы слова. начало
 */
//    FileReader reader = new FileReader("E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt");
//    BufferedReader fileReader = new BufferedReader(reader);
//    /*int count = 0;
//    String out = "";
//
//    while (fileReader.ready()){
//        int i = fileReader.read();
//        out += (char) i;
//    }
//    String[] strings = out.split("world");
//    System.out.println(strings.length);*/
//
//        int count = 0;
//        while (fileReader.ready()) {
//            String[] wordArray = fileReader.readLine().split("\\W");
//            for (String strok : wordArray)
//                if (strok.equals("world")) {
//                    count++;
//                }
//        }
//        System.out.println(count);
/**
 * повторы слова. конец
 */

//        String[] strings = new String[4];
//        strings[0] = "bbb";
//        strings[1] = "ccc";
//        strings[2] = "qwe";
//        strings[3] = "aaa";
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//
//        System.out.println("******************");
////        System.out.println(strings[1].getBytes()[0]);
//        apStringSort(strings);
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }
//    }
//
//
//
//        public static void apStringSort(String[] array) {
//
//        int j;
//        String buffer = "";
//
//        for (int i = 0; i < array.length; i++) {
//            buffer = array[i];
//            for (j = i - 1; j >= 0; j--) {
//                if (array[j].compareTo(buffer) > 0)
//                array[j+1] = array[j];
//            }
//            array[j+1] = buffer;
//        }
//    }

//        public static void sort(String[] array){
//            int j;
//            String buffer = "";
//
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i].compareTo(array[i+1]) > 0){
//                    buffer = array[i];
//                    array[i] = array[i + 1];
//                    array [i + 1] = buffer;
//                }
//            }
//        }
        try(MyStream stream = new MyStream(new BufferedReader(new InputStreamReader(System.in)))){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyStream implements AutoCloseable{

    public MyStream(BufferedReader reader) {
        this.reader = reader;
    }

    private BufferedReader reader = null;

    @Override
    public void close() throws Exception {
        if (reader != null){
            reader.close();
        }
    }
}
