package com.Interfaces;

public interface PaymentMethod1 {

     int processPayment(int id,int amount,String description);
    int refundPayment(int id,int total,float balance);
}

