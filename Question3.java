package com.company;
import java.util.LinkedList;

public class Question3
{
    public static int index(LinkedList<Integer> list, int target)
    {
        if(list.indexOf(target) != -1)
        {
            return list.indexOf(target);
        }

        return -1;
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int minimum = 1000, maximum = 9999, target = 0;

        for(int counter = 0; counter <= 500; counter++)
        {
            int random = (int)Math.floor(Math.random() * (maximum - minimum + 1) + minimum);
            list.add(random);

            if(counter == 500)
            {
                target = (int)Math.floor(Math.random() * (maximum - minimum + 1) + minimum);
            }
        }

        System.out.print(target + " found at index " + index(list, target) + ".");
    }
}