package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        //напишите тут ваш код
       /* SortedMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < alphabet.size(); i++)
        {
            map.put(alphabet.get(i), 0);
        }

        *//*for (SortedMap.Entry<Character, Integer> entry : map.entrySet())
        {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.toString() + value.toString());
        }*//*

        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            //System.out.println("1" + s);
            for (int j = 0; j < s.length(); j++)
            {
                Character ch = s.charAt(j);
                //System.out.println("2" + ch.toString());
                for (SortedMap.Entry<Character, Integer> entry : map.entrySet())
                {
                    Character key = entry.getKey();
                    if (ch.equals(key))
                    {
                        Integer value = entry.getValue();
                        value++;
                        map.put(key, value);
                        //System.out.println(key.toString() + value.toString());

                    }
                }
            }

        }
        for (SortedMap.Entry<Character, Integer> entry : map.entrySet())
        {
            //получить ключ
            Character key = entry.getKey();
            //получить значение
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }*/
//склеить все строки в одну
        String s ="";
        for (int i=0;i<list.size();i++)
            s += list.get(i).toString();

        //бежим по массиву букв
        for (Character c1 : alphabet)
        {
            int count = 0;
            for (Character c2 : s.toCharArray()) //бежим по массиву строки
            {
                if (c2.equals(c1)) count++; //если символы совпадают, то счетчик +1
            }
            System.out.println(c1 + " " + count); // по окончании проверки печатаем и переходим к следующей букве
        }


}

}
