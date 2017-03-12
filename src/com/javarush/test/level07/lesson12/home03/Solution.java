package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List list = new ArrayList();

        Integer  maximum = 0;
        Integer  minimum = 0;
        Integer t;

        //напишите тут ваш код
        for (int i = 0; i < 20; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++)
        {
            t = (Integer) list.get(i);
            if (i == 0)
            {
                maximum = t;
                minimum = t;
            }
            maximum = maximum > t ? maximum : t;
            minimum = minimum < t ? minimum : t;

        }

        System.out.println((int) maximum);
        System.out.println((int) minimum);
    }
}
