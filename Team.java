package com.CSCI185;

public class Team {
    private String name;
    private String gym;
    private String leader;
//    private double WinLossRatio;
    private String gymType;
    private Pokemon[] members = new Pokemon[3];

    public Pokemon[] getMembers() //getting the whole array bc memebers is in the array "Pokemon[]"
    {
        return members;
    }

    public static void fight(Team t1, Team t2)
    {
        for(int i =0; i < t1.getMembers().length; i++ ) //this loops to get the array size for specific team.
        {
           Pokemon.fight(t1.getMembers()[i], t2.getMembers()[i] ); //gets the specific number in the array
                                                                    // to do the method.
        }
    }
    public void addmembers()
    {
        for(int i =0; i < members.length; i++)
        {
            System.out.println("Please enter details for the Pokemon "+i+":");
            members[i] = new Pokemon();
            members[i].readInput();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getGymType() {
        return gymType;
    }

    public void setGymType(String gymType) {
        this.gymType = gymType;
    }



}
