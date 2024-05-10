package com.Interfaces;

public  class CreditCardPayments implements PaymentMethod1 {

    public int processPayment(int id, int amount, String description) {
        System.out.println("the id is " + id);
        return id;
    }

    public int refundPayment(int id, int total, float balance) {

        return 0;
    }
}
