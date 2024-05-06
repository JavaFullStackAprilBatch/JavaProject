package com.oops.assignement.polymorphism.PayementSystem;

public class CashPayment implements PaymentMethod {


    @Override
    public void processPayment(String cardNumber, String expireDate, double amountTopay, double paidAmount) {

        System.out.println("Cash Payment Paid Date: " +expireDate);
        System.out.println("Cash Amount to Pay: $" +amountTopay);
        System.out.println("Cash Amount Paid: $" +paidAmount);
    }

    @Override
    public void refundPayment(double payToAmount, double paidAmount) {
        double amountRefunded = paidAmount-payToAmount;
        System.out.println("Cash Payment refund Amount: $"+amountRefunded);
    }
}
