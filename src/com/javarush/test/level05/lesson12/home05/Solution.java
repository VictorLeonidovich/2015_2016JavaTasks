package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s;
        int sum = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            s = r.readLine();
            if (s.equals("сумма")){
                System.out.println(sum);
                break;
            }
            else
            {
                sum = sum + Integer.parseInt(s);
            }
        }
    }
}
