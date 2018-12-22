package com.javarush.task.task14.task1410;

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
abstract class Drink{
    public void taste(){
        System.out.println("Вкусно");
    }
}
class Wine extends Drink{
    public String getHolidayName(){
        return "День Рождения";
    }
}
class BubblyWine extends Wine{
    public String getHolidayName(){
        return "Новый Год";
    }
}