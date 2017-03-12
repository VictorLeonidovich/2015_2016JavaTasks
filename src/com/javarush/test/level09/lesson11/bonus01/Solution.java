package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        java.io.FileInputStream fileInputStream = null;
        java.io.FileOutputStream fileOutputStream = null;
        try
        {
            fileInputStream = new java.io.FileInputStream(sourceFileName);
            fileOutputStream = new java.io.FileOutputStream(destinationFileName);

            int count = 0;
            while (fileInputStream.available() > 0)
            {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
                count++;
            }

            System.out.println("Скопировано байт " + count);
        }
        catch (java.io.FileNotFoundException e)
        {
            System.out.println("Такого файла нет!");
        }
        finally
        {

            if (fileInputStream != null) fileInputStream.close();
            if (fileOutputStream != null) fileOutputStream.close();
        }
    }
}
