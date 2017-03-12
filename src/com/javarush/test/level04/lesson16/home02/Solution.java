package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String b1 = r.readLine();
        String b2 = r.readLine();
        String b3 = r.readLine();
        int a1 = Integer.parseInt(b1);
        int a2 = Integer.parseInt(b2);
        int a3 = Integer.parseInt(b3);
        if (((a1 < a2) && (a1 > a3)) || ((a1 > a2) && (a1 < a3)))
            System.out.println(a1);
        else {
            if (((a2 < a1) && (a2 > a3)) || ((a2 > a1) && (a2 < a3)))
                System.out.println(a2);
            else
            if (((a3 < a1) && (a3 > a2)) || ((a3 > a1) && (a3 < a2)))
            System.out.println(a3);
    }

    }
}
