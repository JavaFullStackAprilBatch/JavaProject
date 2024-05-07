package com.oops.assignement.polymorphism.PayementSystem;

public class PayPalPayment implements PaymentMethod{

    public void processPayment(String cardNumber, String expireDate, double amountTopay, double paidAmount) {

        System.out.println("Paypal Payment Account Number: " +cardNumber);
        System.out.println("Paypal Payment Paid Date: " +expireDate);
        System.out.println("Paypal Amount To Pay: $" +amountTopay);
        System.out.println("Paypal Amount Paid: $" +paidAmount);
    }

    public void refundPayment(double payToAmount, double paidAmount) {
        double amountRefunded = paidAmount-payToAmount;
        System.out.println("Paypal Payment refund Amount: $"+amountRefunded);
    }
}
