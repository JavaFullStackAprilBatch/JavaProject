package com.oops.assignement.polymorphism.PayementSystem;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment(String cardNumber, String expireDate, double amountToPay, double paidAmount) {
        System.out.println("Credit Card Number: " +cardNumber);
        System.out.println("Credit Card Date: " +expireDate);
        System.out.println("Credit Card Amount to Pay: $" +amountToPay);
        System.out.println("Credit Card Amount Paid: $" +paidAmount);
    }

    @Override
    public void refundPayment(double payToAmount, double paidAmount) {
        double amountRefunded = paidAmount-payToAmount;
        System.out.println("Credit Card refund payment  Amount: $"+amountRefunded);
    }
}
