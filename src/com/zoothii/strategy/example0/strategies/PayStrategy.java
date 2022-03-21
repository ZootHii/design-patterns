package com.zoothii.strategy.example0.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
