package com.zoothii.strategy.example0.strategies;

public class MountOnHorse implements MountOnStrategy {

    private final String name = "Horse";

    @Override
    public int calculateHitPoint(int baseHitPoint) {
        return baseHitPoint * 5;
    }

    @Override
    public String getName() {
        return name;
    }
}
