package com.assignment.paymentsystem;

public class PaypalPayment implements PaymentMethod {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Paypal payment processsed");
	}

	@Override
	public void refundPayment() {
		// TODO Auto-generated method stub
		System.out.println("Paypal refund");
	}

}
