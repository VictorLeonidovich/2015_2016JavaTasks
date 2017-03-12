package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        int count = 0;
        while (true)
        {
            String family = reader.readLine();

            if (family.isEmpty()) break;
            //if (count%2 == 0)

            addresses.add(family);
        }

        //read home number
        String houseNumber = reader.readLine();

        for (int i = 0; i < addresses.size(); i ++)
        {
            if (houseNumber.equals(addresses.get(i)))
            {
                //String familySecondName = addresses.get(houseNumber);
                System.out.println(addresses.get(i + 1));
            }
        }
    }
}
