package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String args[])
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        //System.out.println(map);
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код

        map.put("Stallone2", new Date("JUNE 2 1980"));
        map.put("Stallone3", new Date("JANUARY 3 1980"));
        map.put("Stallone4", new Date("JUNE 4 1980"));
        map.put("Stallone5", new Date("SEPTEMBER 5 1980"));
        map.put("Stallone6", new Date("JUNE 6 1980"));
        map.put("Stallone7", new Date("JUNE 7 1980"));
        map.put("Stallone8", new Date("NOVEMBER 8 1980"));
        map.put("Stallone9", new Date("JUNE 9 1980"));
        map.put("Stallone10", new Date("JUNE 5 1980"));

        return map;
    }


    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        /*for (Map.Entry<String, Date> entry : map.entrySet())
        {*/

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> entry = iterator.next();
            //получить ключ
            //String key = entry.getKey();
            //получить значение
            Date value = entry.getValue();
            int month = value.getMonth();
            if (month == 5 || month == 6 || month == 7)
            {
                iterator.remove();
            }
        }
        //return map;
    }
}
