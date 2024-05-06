package com.assignment.paymentsystem;

public class CreditCardPayment implements PaymentMethod {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Credit card Payement");
	}

	@Override
	public void refundPayment() {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment Refund");
	}

}
