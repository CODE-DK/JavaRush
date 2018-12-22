package com.javarush.task.task14.task1417;

public abstract class Money {
    private double amount;
    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        double newAmount = this.amount;
        return newAmount;
    }

    public abstract String getCurrencyName();
}

