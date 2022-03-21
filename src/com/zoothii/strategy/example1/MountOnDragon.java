package com.zoothii.strategy.example1;

public class MountOnDragon implements MountOnStrategy {

    @Override
    public int calculateHitPoint(int baseHitPoint) {
        return baseHitPoint * 50;
    }

    @Override
    public String getName() {
        return "Dragon";
    }
}
