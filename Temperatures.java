package com.CSCI185;

import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 7 temperatures");
        double sum = 0;
        double[] temp = new double[7];
        for(int i=0; i<7; i++)
        {
            System.out.println("Enter Temp num "+i+": ");
            temp[i] = keyboard.nextDouble(); //this allows you to be able to type in temperature
            sum +=temp[i];
        }
        //Here
        double avg = sum/7;
        System.out.println("The average of 7 temperatures was: "+avg);
        for(int i=0; i<7; i++)
        {
            System.out.println("Temp "+i+" is "+temp[i]);
            if(temp[i]>avg)
            {
                System.out.println("That is larger than the average");
            }
            else if(temp[i]<avg)
            {
                System.out.println("That is smaller than the average");
            }
            else
            {
                System.out.println("That is the average");
            }
        }
    }
}
