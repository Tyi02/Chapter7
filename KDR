package com.CSCI185;

import java.util.Scanner;

// take 5 users KDR for a gae of Valorant
//Make an array to save in
// get average KDR
//Print pro if average above
//print noob if below average
public class KDR {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a team size: ");
        int TeamSize = keyboard.nextInt();
        double sum = 0;
        double avg;
        //array size
        double[] Valo = new double[TeamSize];

        for (int i = 0; i < Valo.length; i++) //length reads whatever the zie the user puts in
        {
            System.out.println("How many kills did player "+i+ " have ");
            //# of kills
            int kills = keyboard.nextInt();

            System.out.println("How many deaths did player "+i+ " have ");
            //# of deaths
            int deaths = keyboard.nextInt();

            //average of player
            double kdr = (double)kills/deaths;//upcasting bc kills and deaths are ints
//            System.out.println("Enter KDR num " + i + ": ");
//            Valo[i] = keyboard.nextDouble(); //this allows you to be able to type in temperature
            Valo[i] = kdr;
            sum += Valo[i];
        }

        //average of team
         avg = sum / Valo.length;



        //prints the status: Noob, Mid, God.
        for (int i = 0; i < Valo.length; i++)
        {
            String status = " ";
            if (Valo[i] > avg) {
               status = "God";
            }
            else if (Valo[i] < avg)
            {
                status = "Noob";
            }
            else
            {
               status = "mid";
            }
            System.out.println("KDR of player " + i + " is: " +status);
        }
    }
}
