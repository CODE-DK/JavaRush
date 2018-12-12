package com.javarush.task.task14.task1419;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.acl.NotOwnerException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        }catch (Exception e) {
            exceptions.add(e);
        }
        try{
            int[] a  = new int[10];
            System.out.println(a[10]);
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            Object o = null;
            System.out.println(o.toString());
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            String a = new String();
            a.wait();
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            String a = "poms";
            int b = Integer.parseInt(a);
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            String a = new String();
            char b = a.charAt(2);
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            BufferedReader a = new BufferedReader(new InputStreamReader(new FileInputStream("123")));
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            Date a = new Date("123");
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new IOException();
        }catch (Exception e){
            exceptions.add(e);
        }
        try{
            throw new NotOwnerException();
        }catch (Exception e){
            exceptions.add(e);
        }
    }
}
