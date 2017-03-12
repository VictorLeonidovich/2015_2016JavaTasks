package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int maximumNum = -2147483648;
        for (int i = 1; i <= maximum; i++)
        {
            int num = Integer.parseInt(reader.readLine());
            maximumNum = max (maximumNum, num);
        }

        System.out.println(maximumNum);
    }
        public static int max (int a, int b)
{
    return a > b ? a : b;
}

}
