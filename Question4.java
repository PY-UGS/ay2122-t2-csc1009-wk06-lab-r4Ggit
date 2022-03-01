package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Question4
{
    public static void update( HashMap<Integer, Integer> list, int value)
    {
        list.put(list.size(), value);
        int temp = 0;

        for (int key:list.keySet())
        {
            if(value <= list.get(key))
            {
                temp = list.get(key);
                list.put(key, value);
                value = temp;
            }
        }

        list.put(list.size() - 1, temp);
    }

    public static void swap(HashMap<Integer, Integer> list, int indexes[])
    {
        int temp = list.get(indexes[0]);
        list.put(indexes[0], list.get(indexes[1]));
        list.put(indexes[1], temp);

    }

    public static void main(String[] args)
    {
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        int index = 0;

        for(int counter  = 0; counter < 12; counter++)
        {
            if(counter % 2 == 1)
            {
                list.put(index, counter);
                index++;
            }
        }

        System.out.println("Initial List: " + list);

        Scanner input = new Scanner(System.in);

        System.out.print("\nInserting a new value into the list: ");

        int value = input.nextInt();

        update(list, value);

        System.out.println("Updated list: " + list + "\n");

        // Question 5
        int[] indexes = new int[2];

        for(int counter = 0; counter < indexes.length; counter++)
        {
            System.out.print("Swapping number[" + (counter + 1) +  "] at index: ");
            indexes[counter] = input.nextInt();

            while(indexes[counter] >= list.size())
            {
                System.out.print("Please key in an index within the list size[" + (list.size() - 1) + "] : ");
                indexes[counter] = input.nextInt();
            }
        }

        swap(list, indexes);

        System.out.print("Swapped List: " + list);
    }
}