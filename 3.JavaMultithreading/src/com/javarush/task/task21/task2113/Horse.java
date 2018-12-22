package com.javarush.task.task21.task2113;

/**
 * Created by Dmitriy on 28.10.2017.
 */
public class Horse {

    private String name = null;
    private double speed = 0d;
    private double distance = 0d;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {

        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move(){
        distance += speed * Math.random();
    }

    public void print(){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < (int) getDistance(); i++) {
            stringBuilder.append('.');
        }

        stringBuilder.append(getName());

        System.out.println(stringBuilder.toString());
    }
}
