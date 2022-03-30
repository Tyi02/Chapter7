package com.CSCI185;

import java.util.Scanner;

public class OutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the array size?");
        int size = keyboard.nextInt();
        int[] num = new int[size];

        System.out.println("What position do you want to save a value in?");
        int position = keyboard.nextInt();
        System.out.println("What value do you want to save there? ");
        int val = keyboard.nextInt();
        if(position<size)

            num[position] = val;
        else
            System.out.println("Thats out of range ");

        int[] x = {1,2,3,4,5};
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
        }
        String[] tasks = new String[10];
        tasks[3] = "Buy milk";
        tasks[5] = "Play Halo";

        }
        }


