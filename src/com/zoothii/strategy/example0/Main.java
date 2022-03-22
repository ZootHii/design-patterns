package com.zoothii.strategy.example0;

import com.zoothii.strategy.example0.character.Character;
import com.zoothii.strategy.example0.strategies.MountOnDragon;
import com.zoothii.strategy.example0.strategies.MountOnHorse;

public class Main {

    public static void main(String[] args) {
        Character character = new Character(10);
        System.out.println(character.getMountOn());
//        System.out.println(character.getMountOnStrategy());
        System.out.println(character.getBaseHitPoint());
        System.out.println(character.getCalculatedHitPoint());

        System.out.println("------------------------");

        character.mountOn(new MountOnDragon());
        System.out.println(character.getMountOn());
//        System.out.println(character.getMountOnStrategy());
        System.out.println(character.getBaseHitPoint());
        System.out.println(character.getCalculatedHitPoint());

        System.out.println("------------------------");

        var horse = new MountOnHorse();
        character.mountOn(horse);
        character.mountOn(horse);
        System.out.println(character.getMountOn());
//        System.out.println(character.getMountOnStrategy());
        System.out.println(character.getBaseHitPoint());
        System.out.println(character.getCalculatedHitPoint());
        character.mountOff(horse);
        System.out.println(character.getMountOn());
//        System.out.println(character.getMountOnStrategy());
        System.out.println(character.getBaseHitPoint());
        System.out.println(character.getCalculatedHitPoint());

    }
}
