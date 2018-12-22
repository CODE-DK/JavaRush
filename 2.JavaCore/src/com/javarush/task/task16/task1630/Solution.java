package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName = "";
        private String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return this.fileContent;
        }

        @Override
        public void start() {
            this.run();
        }

        @Override
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                while (bufferedReader.ready()){
                    fileContent += bufferedReader.readLine() + " ";
                }
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("FileNotFoundException");
            }
        }
    }

}
