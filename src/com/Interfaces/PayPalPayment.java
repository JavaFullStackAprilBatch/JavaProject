package com.Interfaces;

public class PayPalPayment implements PaymentMethod1{


    public int processPayment(int id, int amount, String description) {
        return 0;
    }

    public int refundPayment(int id, int total, float balance) {
        return 0;
    }
}