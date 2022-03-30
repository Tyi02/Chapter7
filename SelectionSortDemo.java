package com.CSCI185;

public class SelectionSortDemo
{
    public static void main (String [] args)
    {
        int [] b = {4,1,2,3};
        display (b, "before");
        ArraySorter.selectionSort (b);
        display (b, "after");
    }


    public static void display (int [] array, String when)
    {
        System.out.println ("Array values " + when + " sorting:");
        for (int i = 0 ; i < array.length ; i++)
            System.out.print (array [i] + " ");
        System.out.println ();
    }
}