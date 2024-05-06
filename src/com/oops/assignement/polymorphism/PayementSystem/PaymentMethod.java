package com.oops.assignement.polymorphism.PayementSystem;

public interface PaymentMethod {

    public void processPayment(String cardNumber, String expireDate, double amountToPay, double paidAmount);
    public void refundPayment(double payToAmount, double paidAmount);

}
