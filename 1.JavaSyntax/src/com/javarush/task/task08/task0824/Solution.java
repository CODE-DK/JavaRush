package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args)
    {
        Human CH1 = new Human("CH1", true, 5);
        Human CH2 = new Human("CH2", false, 7);
        Human CH3 = new Human("CH3", true, 11);
        Human F = new Human("F", true, 46, CH1, CH2, CH3);
        Human M = new Human("M", false, 41, CH1, CH2, CH3);
        Human GF1 = new Human("GF1", true, 81, F);
        Human GF2 = new Human("GF2", true, 74, M);
        Human GM1 = new Human("GM1", false, 77, F);
        Human GM2 = new Human("GM2", false, 82, M);

        System.out.println(CH1.toString());
        System.out.println(CH2.toString());
        System.out.println(CH3.toString());
        System.out.println(F.toString());
        System.out.println(M.toString());
        System.out.println(GF1.toString());
        System.out.println(GM1.toString());
        System.out.println(GF2.toString());
        System.out.println(GM2.toString());
    }
    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
        Human(String name, boolean sex, int age, Human ...children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            for (Human i : children)
            {
                this.children.add(i);
            }
        }
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
    }

}
