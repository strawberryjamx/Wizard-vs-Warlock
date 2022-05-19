package com.example.wizard_vs_warlock_act;

public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;


    //two Constructors
    //non-parameterized Constructor
    Character(){
        System.out.println("null");
    }
    //Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    Character(String name, int lvl, int hp, int mana) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints, int manadecrease, Character name) {
        /**
         * Deduct health points from enemy character
         */
        // + deduct character manapoints
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
        name.manaPoints = name.manaPoints - manadecrease;

        /**
         * Prompt Character is defeated if HP falls below 0
         */
        // + Level Up Character
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            name.level += 10;
            System.out.println(name.characterName + " Level up!!");

        }
    }


    public void leveup(Character name){
        name.level += 10;
        System.out.println(name.characterName+ " Level Upp");

    }

    //method on displaying current character details
    public void displaydetails(){
        System.out.println("Wizard : " + characterName);
        System.out.println("HealthPoints : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");


    }

}