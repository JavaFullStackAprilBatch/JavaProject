package com.Interfaces;

public class FinalInterface {
    public static void main(String[] args) {
    CreditCardPayments CR = new CreditCardPayments();
    CashPayment CS = new CashPayment();
    CS.processPayment(1000,4667567,"paid");
    CS.refundPayment(123,1234435,12);
    PayPalPayment PA = new PayPalPayment();

    }
}
