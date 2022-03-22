package com.zoothii.strategy.example0.strategies;

public class MountOnDragon implements MountOnStrategy {

    private final String name = "Dragon";

    @Override
    public int calculateHitPoint(int baseHitPoint) {
        return baseHitPoint * 50;
    }

    @Override
    public String getName() {
        return name;
    }
}
