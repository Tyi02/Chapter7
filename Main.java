package com.CSCI185;

public class Main {
    public static void main(String[] args) {
        int[] grades = new  int[7];
        grades[0] = 100;
        grades[1] = 25;
        grades[2] = 99;
        grades[3] = 102;
        grades[4] = 75;
        grades[5] = 82;
        grades[6] =0;

        int[] ids = {123, 123, 423, 235, 5435, 777, 1234};

        for(int i=0; i<7; i++)
        {
            System.out.println("Grade "+i+ ": "+grades[i]);
        }

    }
}
