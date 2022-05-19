package com.example.wizard_vs_warlock_act;

public class Warlock extends Character{
    //Warlock constructor inherits character class
    Warlock(String name,int lvl,int hp,int mana){
        super(name,lvl,hp,mana);
    }
    //Warlock Skills method class
    //Warlock skill no.1 with damage and mana reduction upon cast
    public void sunstrike(Character enemyCharacter, Character name){
        int damagePoints = 80;
        int manadecrease = 35;
        System.out.println(super.characterName + " Lightning Bolt (-35 Mana) " + enemyCharacter.characterName + " Damage done(-80hp)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }

    //Warlock Skill no. 2 Self-heal(Health Points Increase)
    public void revitalize(Character name) {
        super.healthPoints += 50;
        System.out.println(super.characterName+" Health restored + 50hp");
    }

    //Warlock skill no.3 with damage and mana reduction upon cast
    public void defeaningblast(Character enemyCharacter,Character name){
        int damagePoints = 70;
        int manadecrease = 30;
        System.out.println(super.characterName + " Soul Strike (-30 Mana) " + enemyCharacter.characterName + " Damage done(-70hp)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }

}