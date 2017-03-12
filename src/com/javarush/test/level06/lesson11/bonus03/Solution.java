package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List list = new ArrayList();
        int s;

        //напишите тут ваш код
        for (int i = 0; i < 5; i++)
        {
            s = Integer.parseInt(reader.readLine());
            list.add(s);

        }
        Collections.sort(list);/**, new Comparator()
        {

            @Override
            public int compare(Object o1, Object o2)
            {
                return o1.equals().compareTo(o2.equals());
            }



        });
*/

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
