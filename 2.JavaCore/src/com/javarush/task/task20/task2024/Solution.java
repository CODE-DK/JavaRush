package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable{
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) {

    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(node);
        out.writeObject(edges);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        node = in.readInt();
        edges = (List<Solution>) in.readObject();
    }
}
