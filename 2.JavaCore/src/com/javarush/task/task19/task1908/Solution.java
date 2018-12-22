package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader1.ready()){
            String s = reader1.readLine();
            String[] q = s.split(" ");
            for (int i = 0; i < q.length; i++) {
                try{
                    writer.write(Integer.parseInt(q[i]) + " ");
                }catch (Exception e){

                }
            }
        }
        reader1.close();
        writer.close();
    }
}
/*

E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f1.txt
E:\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\del_try_fast_sort\\f2.txt

*/
