package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private String street;
        private Integer houseNumber;
        private Integer telephone;
        private Boolean sex;

        public Human(){}

        public Human(Boolean sex){
            this.sex = sex;}

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, Integer telephone){
            this.firstName = firstName;
            this.lastName = lastName;
            this.telephone = telephone;
        }

        public Human(String firstName, String lastName, Boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, Integer telephone, Boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.telephone = telephone;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, String street, Integer houseNumber ){
            this.firstName = firstName;
            this.lastName = lastName;
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public Human(String firstName, String lastName, Boolean sex, String street, Integer houseNumber ){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public Human(String firstName, String lastName, Boolean sex, String street, Integer houseNumber, Integer telephone ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.street = street;
            this.houseNumber = houseNumber;
            this.telephone = telephone;
        }

        public Human(String street, Integer houseNumber, Integer telephone){
            this.street = street;
            this.houseNumber = houseNumber;
            this.telephone = telephone;}
    }
}
