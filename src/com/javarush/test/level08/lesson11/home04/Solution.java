package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // System.out.println(2);
        List<Integer> integerList = getIntegerList();
        //System.out.println(2);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array)
    {
        // Найти минимум
        int minimum = array.get(0);
        for (int i = 0; i < array.size(); i++)
        {
            int i1 = array.get(i);
            minimum = minimum < i1 ? minimum : i1;
        }


        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        //Тут создать и заполнить список
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        Integer N = Integer.parseInt(reader.readLine());
        //System.out.println(3);
        for (int i = 0; i < N; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
