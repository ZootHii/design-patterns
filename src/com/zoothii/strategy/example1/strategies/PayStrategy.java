package com.zoothii.strategy.example1.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
