package com.CSCI185;

public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        for(int number:numbers) //for each loop
        {
            System.out.println(number);
        }
        String [] people = {"George", "Joe", "Terry"};
        for(String person:people)
        {
            System.out.println("Hi "+ person);
        }

    }
}
