package com.assignment.paymentsystem;

public class PaymentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod creditPay = new CreditCardPayment();
		creditPay.processPayment();
		creditPay.refundPayment();
		
		PaymentMethod paypalPay=  new PaypalPayment();
		paypalPay.processPayment();
		paypalPay.refundPayment();
		
		PaymentMethod cashPay = new CashPayment();
		cashPay.processPayment();
		cashPay.refundPayment();
	}

}
