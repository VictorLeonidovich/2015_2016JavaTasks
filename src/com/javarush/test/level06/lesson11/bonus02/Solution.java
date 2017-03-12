package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*Cat nameNullMo = new Cat("null", null, null);
        Cat nameNullFa = new Cat("null", null, null);
        Cat nameNullMo1 = new Cat("null", null, null);
        Cat nameNullFa1 = new Cat("null", null, null);
        Cat nameNullMo2 = new Cat("null", null, null);
        Cat nameNullFa2 = new Cat("null", null, null);
*/
        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSun);
        System.out.println(catDaughter);
        reader.close();

    }

    public static class Cat
    {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

         Cat(String name)
         {
             this.name = name;
         }
        Cat(String name, Cat parentFather, Cat parentMother)
        {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString()
        {
            if (parentMother == null && parentFather == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            else if (parentFather == null)
                return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";
            else if (parentMother == null)
                return "Cat name is " + name + ", no mother" + ", father is " + parentFather.name;
            else
                return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
        }
        /*public String toString()
        {
            String res = "Cat name is " + name;
            if (parentMother == null)
                res += ", no mother";
            else
                res += ", mother is " + parentMother.name;
            if (parentFather == null)
                res += ", no father";
            else
                res += ", father is " + parentFather.name;
            return res;
        }*/
    }

}
