package com.javarush.task.task16.task1632;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dmitriy on 25.06.2017.
 */

public class Thread5 extends Thread {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (isAlive()){
            try{
                sum += scanner.nextInt();
            }catch (InputMismatchException e){
                if (scanner.nextLine().equals("N")){
                    System.out.println(sum);
                    interrupt();
                }
            }
        }
    }
}
