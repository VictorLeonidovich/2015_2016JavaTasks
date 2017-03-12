package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String address;
        private boolean sex;
        private String dog;
        private String cat;
//1
        public Human(String name)
        {
            this.name = name;
        }
//2
        public Human(int age)
        {
            this.age = age;
        }
//3
        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
//4
        public Human(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
//5
        public Human(String name, int age, String address, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
        }
//6
        public Human(String name, int age, String address, boolean sex, String dog)
        {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.dog = dog;
        }
//7
        public Human(String name, int age, String address, boolean sex, String dog, String cat)
        {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.dog = dog;
            this.cat = cat;

        }
//8
        public Human(String cat, boolean sex, String dog)
        {
            this.cat = cat;
            this.sex = sex;
            this.dog = dog;
        }
        //9

        public Human(int age, String address, boolean sex, String dog)
        {
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.dog = dog;
        }


        //10


        public Human(String address, boolean sex, String dog, String cat)
        {
            this.address = address;
            this.sex = sex;
            this.dog = dog;
            this.cat = cat;
        }
    }

}
