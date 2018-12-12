package com.javarush.task.task14.task1413;

public class Computer{
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    Monitor getMonitor() {
        return monitor;
    }

    Mouse getMouse() {
        return mouse;
    }

    Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
}
