package com.zoothii.strategy.example0.character;

import com.zoothii.strategy.example0.strategies.MountOnStrategy;

public class Character {

    private final int baseHitPoint;
    private int calculatedHitPoint;
    private MountOnStrategy mountOnStrategy;

    public Character(int baseHitPoint) {
        this.baseHitPoint = baseHitPoint;
        this.calculatedHitPoint = baseHitPoint;
    }

    public void mountOn(MountOnStrategy mountOnStrategy) {
        if (this.mountOnStrategy != null && this.mountOnStrategy != mountOnStrategy) {
            System.out.println("Mounting off " + this.mountOnStrategy.getName());
            System.out.println("Mounting on " + mountOnStrategy.getName());
            this.mountOnStrategy = mountOnStrategy;
            calculatedHitPoint = mountOnStrategy.calculateHitPoint(baseHitPoint);
        } else if (this.mountOnStrategy == mountOnStrategy) {
            System.out.println("Already mounted on " + this.mountOnStrategy.getName());
        } else {
            System.out.println("Mounting on " + mountOnStrategy.getName());
            this.mountOnStrategy = mountOnStrategy;
            calculatedHitPoint = mountOnStrategy.calculateHitPoint(baseHitPoint);
        }
    }

    public void mountOff(MountOnStrategy mountOnStrategy) {
        if (this.mountOnStrategy != null && this.mountOnStrategy == mountOnStrategy) {
            System.out.println("Mounting off " + mountOnStrategy.getName());
            this.mountOnStrategy = null;
            calculatedHitPoint = baseHitPoint;
        }
    }

    public MountOnStrategy getMountOnStrategy() {
        return mountOnStrategy;
    }

    public String getMountOn() {
        if (mountOnStrategy != null) {
            return mountOnStrategy.getName();
        }
        return null;
    }

    public int getBaseHitPoint() {
        return baseHitPoint;
    }

    public int getCalculatedHitPoint() {
        return calculatedHitPoint;
    }
}
