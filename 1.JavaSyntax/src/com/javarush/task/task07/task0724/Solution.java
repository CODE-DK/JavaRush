package com.javarush.task.task07.task0724;

/* 
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Human firstGrandFather = new Human("Андрей", true, 81);
        Human secondGrandFather = new Human("Виктор", true, 74);
        Human firstGrandMother = new Human("Анна", false, 71);
        Human secondGrandMother = new Human("Мария", false, 85);
        Human father = new Human("Евгений", true, 45, firstGrandFather, firstGrandMother);
        Human mother = new Human("Елена", false, 42, secondGrandFather, secondGrandMother);
        Human firstChild = new Human("Дмитрий", true, 5, father, mother);
        Human secondChild = new Human("Александр", true, 7, father, mother);
        Human thirdChild = new Human("Ирина", false, 11, father, mother);
        System.out.println(firstGrandFather.toString());
        System.out.println(secondGrandFather.toString());
        System.out.println(firstGrandMother.toString());
        System.out.println(secondGrandMother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(firstChild.toString());
        System.out.println(secondChild.toString());
        System.out.println(thirdChild.toString());
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















