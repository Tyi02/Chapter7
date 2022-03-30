package com.CSCI185;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] nums = {1,13,69,420,5280,3,21};
        System.out.println(search(nums, 21));



    }
    public static int search(int[] n, int number)
    {
        int position = -1; //if the number set is not in the array, prints -1.
        for(int i=0; i<n.length; i++)
        {
            if(n[i] == number)
            {
                position = i; //if the number set is in the array, prints the position it is in within the array
                break;
            }
        }
        return position;
    }
}
