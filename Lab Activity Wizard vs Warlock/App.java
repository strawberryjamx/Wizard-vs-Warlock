package com.example.wizard_vs_warlock_act;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");

        //Wizard and Warlock object class inheriting Character Class
        Wizard Character1 = new Wizard("Player 1", 1, 100, 150);
        Warlock Character2 = new Warlock("Player 2",1,100,150);

        //character actions sequence
        //1 skill required per round
        System.out.print("\n");
        //Displaying Character name and details
        Character1.displayName();
        Character1.displaydetails();
        Character2.displayName();
        Character2.displaydetails();

        //first round match
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Let The Game Begin!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\n------------");
        System.out.println("Round 1");
        System.out.println("------------\n");
        //skill casts
        Character1.chaosmeteor(Character2,Character1);
        Character2.sunstrike(Character1,Character2);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //second round match
        System.out.println("\n------------");
        System.out.println("Round 2");
        System.out.println("------------\n");
        //skill casts
        Character2.defeaningblast(Character1,Character2);
        Character1.coldsnap(Character2,Character1);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //Third round match
        System.out.println("Round 3\n");
        //skill casts
        Character1.chaosmeteor(Character1,Character2);
        Character2.revitalize(Character2);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //Fourth round match
        System.out.println("Round 4\n");
        //skill casts
        Character2.defeaningblast(Character1,Character2);
        Character1.chaosmeteor(Character2,Character1);
        //displaying current character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();


    }
}