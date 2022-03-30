package com.CSCI185;

public class Swap {
    int x = 5;
    int y = 8;

    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int backup = x;

        x=y;
        y = backup;

        System.out.println("X is: "+x);//want this to be 8
        System.out.println("Y is: "+y);//want this to be 5

    }


}
