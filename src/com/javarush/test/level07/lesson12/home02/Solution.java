package com.javarush.test.level07.lesson12.home02;

//import groovy.ui.SystemOutputInterceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        //String[] a = new String[M];
        String b;
        for (int i = 0; i < N; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++)
        {
            b = list.get(0);
            list.remove(0);
            list.add(N-1, b);
            //a[i] = list.get(i);
        }
        /*for (int i = 0; i < M; i++)
        {
            list.remove(0);
        }
        for (int i = 0; i < M; i++)
        {
           // list.add(a[i]);
        }*/
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
