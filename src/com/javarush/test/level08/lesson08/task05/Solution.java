package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> vocabulary = createMap();
        removeTheFirstNameDuplicates(vocabulary);
        /*for (Map.Entry<String, String> pair : vocabulary.entrySet())
        {
            System.out.println(pair.getKey() + pair.getValue());
        }*/


    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("bob", "martin");
        vocabulary.put("bobic", "martina");
        vocabulary.put("boba", "martish");
        vocabulary.put("bo", "martin");
        vocabulary.put("bobr", "martinc");
        vocabulary.put("borb", "martins");
        vocabulary.put("brob", "umartin");
        vocabulary.put("bobu", "martin");
        vocabulary.put("sbob", "martil");
        vocabulary.put("boby", "martin");
        return vocabulary;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        //System.out.println(map.values());
        ArrayList<String> list = new ArrayList<String>(map.values());
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            for (int j = 0; j < list.size(); j++)
            {
                String t = list.get(j);

                if (!(i == j) && (s.equals(t)))
                {
                    //System.out.println(list.get(i));
                    removeItemFromMapByValue(map, s);
                }
            }

        }

    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            //System.out.println(pair.getKey() + pair.getValue());
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
            //System.out.println(pair.getKey() + pair.getValue());
        }
    }
}
