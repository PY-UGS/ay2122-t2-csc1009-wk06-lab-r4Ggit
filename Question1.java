package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Question1
{
    public static void update(LinkedList<Integer> list, int value)
    {
        for (int counter  = 0; counter < list.size(); counter++)
        {
            if(value <= list.get(counter))
            {
                list.add(counter, value);
                break;
            }
        }
    }

    public static void swap(LinkedList<Integer> list, int index[])
    {
        int temp = list.get(index[0]);
        list.set(index[0], list.get(index[1]));
        list.set(index[1], temp);
    }

    public static void main(String[] args)
    {
        // Question 1
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int counter  = 0; counter < 12; counter++)
        {
            if(counter % 2 == 1)
            {
                list.add(counter);
            }
        }

        System.out.println("Initial List: " + list);

        Scanner input = new Scanner(System.in);

        System.out.print("\nInserting a new value into the list: ");

        int value = input.nextInt();

        update(list, value);

        System.out.println("Update list: " + list + "\n");

        // Question 2
        int[] index = new int[2];

        for(int counter = 0; counter < index.length; counter++)
        {
            System.out.print("Swapping number[" + (counter + 1) +  "] at index: ");
            index[counter] = input.nextInt();

            while(index[counter] >= list.size())
            {
                System.out.print("Please key in an index within the list size[" + (list.size() - 1) + "] : ");
                index[counter] = input.nextInt();
            }
        }

        swap(list, index);

        System.out.print("Swapped List: " + list);
    }
}