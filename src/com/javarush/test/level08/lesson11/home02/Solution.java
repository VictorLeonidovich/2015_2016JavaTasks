package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.Objects;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();


        Set<Object> pets = join(cats, dogs);
        /*printPets(pets);
System.out.println();*/
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++)
        {
            result.add(new Cat());
        }
        return result;
    }


    public static Set<Dog> createDogs()
    {
        Set<Dog> result2 = new HashSet<Dog>();
        //напишите тут ваш код
        for (int x = 0; x < 3; x++)
        {
            result2.add(new Dog());
        }
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> result3 = new HashSet<Object>();
        //напишите тут ваш код
        /*int x = 0, y = 0;
        Iterator<Cat> itrCat = cats.iterator();
        while (itrCat.hasNext())
        {
            System.out.println(x++);
            result.add(itrCat);
        }
        Iterator<Dog> itrDog = dogs.iterator();
        while (itrDog.hasNext())
        {

            System.out.println(y++);
            result.add(itrDog);
        }*/
        result3.addAll(cats);
        result3.addAll(dogs);
        return result3;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код
        /*Iterator<Object> itrPets = pets.iterator();
        Iterator<Cat> itrCats = cats.iterator();
        while (itrPets.hasNext())
        {
            while (itrCats.hasNext())
            {
                if (itrPets.equals(itrCats))
                    pets.remove(itrPets);
            }
        }*/
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        Iterator<Object> itrPets = pets.iterator();
        while (itrPets.hasNext())
        {
            System.out.println(itrPets.next());
        }
        //return result;
    }

    //напишите тут ваш код
    public static class Cat

    {
        /*public int i;

        public Cat(int i)
        {
            this.i = i;
        }*/
    }

    public static class Dog

    {
        /*public int i;

        public Dog(int i)
        {
            this.i = i;
        }*/
    }
}

