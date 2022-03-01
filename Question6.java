package com.company;
import java.util.HashMap;

public class Question6
{
    public static int index(HashMap<Integer, Integer> list, int target)
    {
        for(int key:list.keySet())
        {
            if(list.get(key) == target)
            {
                return key;
            }
        }

        return -1 ;
    }

    public static void main(String[] args)
    {
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        int minimum = 1000, maximum = 9999, target = 0;

        for(int counter = 0; counter <= 500; counter++)
        {
            int random = (int)Math.floor(Math.random() * (maximum - minimum + 1) + minimum);
            list.put(counter, random);

            if(counter == 500)
            {
                target = (int)Math.floor(Math.random() * (maximum - minimum + 1) + minimum);
            }
        }

        System.out.print(target + " found at index " + index(list, target) + ".");
    }
}