package com.zoothii.strategy.example1;

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
