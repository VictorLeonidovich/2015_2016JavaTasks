package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        Map<Integer, String> month = new HashMap<>();

        String[] mth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < 12; i++)

        {

            month.put(i + 1, mth[i]);

        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String result = reader.readLine();

        for (Map.Entry<Integer, String> entry : month.entrySet())
        {

           String r =  entry.getValue();

            if (r.equals(result)) System.out.println(r + " is " + entry.getKey() +" month");

        }
    }

}
