package com.javarush.task.task17.task1717;


public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        solution.startTest();
    }

    public void startTest() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            new Thread(new myThread()).start();
        }
    }
}


class Qqq {
    private static volatile Qqq syngl;
    private String name;

    private Qqq(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Qqq newQqq(){
        if(syngl == null){
            synchronized (Qqq.class){
                if(syngl == null) {
                    int i = (int) Math.round(Math.random() * 100);
                    syngl = new Qqq("a" + i);
                }
            }
        }
        return syngl;
    }
}

class myThread implements Runnable{

    @Override
    public void run() {
        Qqq qqq = Qqq.newQqq();
        System.out.print(qqq.getName() + " ");
    }
}
