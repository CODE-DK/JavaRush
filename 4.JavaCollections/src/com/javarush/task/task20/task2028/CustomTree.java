package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

public class CustomTree extends AbstractList implements Cloneable, Serializable {
    private Entry root;

    public void add(String s){
        Entry newEnrty = new Entry(s);
        if (root == null){
            root = newEnrty;
        }else{
            Entry focusEntry = root;
            Entry parent;

            while (true){
                parent = focusEntry;
                parent.parent = parent;
                if (newEnrty.lineNumber < focusEntry.lineNumber){
                    focusEntry = focusEntry.leftChild;
                    if (focusEntry == null){
                        parent.leftChild = newEnrty;
                        return;
                    }
                }else{
                    focusEntry = focusEntry.rightChild;
                    if (focusEntry == null){
                        parent.rightChild = newEnrty;
                        return;
                    }
                }
            }
        }
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean remove(Object o){

        String s = o.toString();

        Entry focusEntry = root;
        Entry parent = root;

        boolean isItALeftChild = true;
        while (focusEntry.elementName.equals(s)){
            parent = focusEntry;
            if (s.compareTo(focusEntry.elementName) < 0){
                isItALeftChild = true;
                focusEntry = focusEntry.leftChild;
            }else{
                isItALeftChild = false;
                focusEntry = focusEntry.rightChild;
            }
            if (focusEntry == null){
                return false;
            }
        }
        if (focusEntry.leftChild == null && focusEntry.rightChild == null){
            if (focusEntry == root){
                root = null;
            }else if (isItALeftChild){
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }
        }
        else if (focusEntry.rightChild == null){
            if (focusEntry == root){
                root = focusEntry.leftChild;
            }else if (isItALeftChild){
                parent.leftChild = focusEntry.leftChild;
            }else parent.rightChild = focusEntry.leftChild;
        }
        else if (focusEntry.leftChild == null){
            if (focusEntry == root){
                root = focusEntry.rightChild;
            }else if (isItALeftChild){
                parent.leftChild = focusEntry.rightChild;
            }else parent.rightChild = focusEntry.rightChild;
        }
        else {
            Entry replacement = getReplacementEntry(focusEntry);
            if (focusEntry == root){
                root = replacement;
            }
            else if (isItALeftChild){
                parent.leftChild = replacement;
            }
            else parent.rightChild = replacement;

            replacement.leftChild = focusEntry.leftChild;
        }
        return true;
    }

    public  Entry getReplacementEntry(Entry replacedEntry){
        Entry replacementParent = replacedEntry;
        Entry replacement = replacedEntry;

        Entry focusEntry = replacedEntry.rightChild;

        while(focusEntry != null){
            replacementParent = replacement;
            replacement = focusEntry;
            focusEntry = focusEntry.leftChild;
        }

        if (replacement != replacedEntry.rightChild){
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedEntry.rightChild;
        }

        return replacement;
    }

    //обход графа сверху вниз (сортировка по уровням дерева)
//    public void preorderTraverseTree (Entry focusEntry){
//        if (focusEntry != null){
//            System.out.println(focusEntry.toSrting());
//            preorderTraverseTree(focusEntry.leftChild);
//            preorderTraverseTree(focusEntry.rightChild);
//        }
//    }

    // обход графа снизу вверх (сортировка по уровням дерева)
//    public void postOrderTraverseTree (Entry focusEntry){
//        if (focusEntry != null){
//            postOrderTraverseTree(focusEntry.leftChild);
//            postOrderTraverseTree(focusEntry.rightChild);
//            System.out.println(focusEntry.toSrting());
//        }
//    }

    //обход графа от меньшего ключа до большего (сортировка по ключу)
    public void inOrderTraverseTree (Entry focusEntry){
        if (focusEntry != null){
            inOrderTraverseTree(focusEntry.leftChild);
            System.out.println(focusEntry.getSrting());
            inOrderTraverseTree(focusEntry.rightChild);
        }
    }

    //поиск элемента по ключу
    public Entry findEntry(int lineNymber){
        Entry focusEntry = root;
        while (focusEntry.lineNumber != lineNymber){
            if (lineNymber < focusEntry.lineNumber){
                focusEntry = focusEntry.leftChild;
            }else{
                focusEntry = focusEntry.rightChild;
            }

            if (focusEntry == null){
                return null;
            }
        }
        return focusEntry;
    }

    public String getParent(String s) {
        return findEntry(new Entry(s).lineNumber).parent.elementName;
    }

    public static void main(String[] args) {
        CustomTree list = new CustomTree();
        for (int i = 0; i < 15; i++) {
            list.add(String.valueOf(i));
        }

        list.inOrderTraverseTree(list.root);
        System.out.println("********************************");
        System.out.println(list.getParent("3"));

//        System.out.println(list.size());
//        list.preorderTraverseTree(list.root);
//        System.out.println("********************************");
//        list.postOrderTraverseTree(list.root);
//        System.out.println("********************************");

//        System.out.println("search for 1");
//        System.out.println(list.findEntry(1).toSrting());
//        System.out.println("********************************");
//
//        System.out.println("try to search for 30");
//        try{
//            System.out.println(list.findEntry(30).toSrting());
//        }catch (NullPointerException e){
//            System.out.println("invalid search");
//        }



        //System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
//        list.remove("5");
//        list.remove("1");
//        list.remove("8");
//        list.inOrderTraverseTree(list.root);
//        System.out.println(list.getParent("2"));
        //System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
    }

    // this is Node
    static class Entry implements Serializable {
        String elementName;
        int lineNumber;

        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.lineNumber = Integer.parseInt(elementName);

            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren() {
            if (leftChild != null)
                availableToAddLeftChildren = false;
            if (rightChild != null)
                availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

        public String getSrting(){
            return elementName + " has a line number " + lineNumber;
        }
    }


    public String get(int index) {
        throw new UnsupportedOperationException();
        //return null;
    }

    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
        //return super.addAll(index, c);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
        //return super.subList(fromIndex, toIndex);
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
        //super.removeRange(fromIndex, toIndex);
    }
}
