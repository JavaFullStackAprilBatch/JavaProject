package com.oops.assignement.polymorphism.PayementSystem;

public class PaymentSystem {
    public static void main(String[] arg) {

        PaymentMethod ccp = new CreditCardPayment();
        String date = "06/2028";
        ccp.processPayment("2234-9876-9098-9856", date, 500, 800);
        ccp.refundPayment(500, 800);

        PaymentMethod pp = new PayPalPayment();
        date = "01/05/2028";
        pp.processPayment("A23443555",date, 1000, 1500);
        pp.refundPayment(1000,1500);

        PaymentMethod cp = new CashPayment();
        date = "05/05/2024";
        cp.processPayment(null,date,2000,3500);
        cp.refundPayment(2000,3500);

    }
}
