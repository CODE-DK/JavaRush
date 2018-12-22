package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitriy on 28.10.2017.
 */
public class Hippodrome {

    private List<Horse> horses = null;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {

        List<Horse> horses = new ArrayList<>();

        horses.add(new Horse("Sleven", 3d, 0d));
        horses.add(new Horse("Lucky", 3d, 0d));
        horses.add(new Horse("Gomer", 3d, 0d));

        game = new Hippodrome(horses);

        try {
            game.run();
            game.printWinner();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move(){
        //управляет движением всех лошадей

        for (Horse horse : horses) {
            horse.move();
        }

    }

    public void print(){
        //отрисовывает лошадь на экран

        for (Horse horse : horses) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){

        Horse winner = horses.get(0);
        double maxDistance = winner.getDistance();

        for (Horse horse : horses) {
            if (horse.getDistance() >= maxDistance){
                winner = horse;
                maxDistance = winner.getDistance();
            }
        }

        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
