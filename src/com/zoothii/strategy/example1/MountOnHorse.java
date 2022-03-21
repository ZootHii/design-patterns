package com.zoothii.strategy.example1;

public class MountOnHorse implements MountOnStrategy {

    @Override
    public int calculateHitPoint(int baseHitPoint) {
        return baseHitPoint * 5;
    }

    @Override
    public String getName() {
        return "Horse";
    }
}
