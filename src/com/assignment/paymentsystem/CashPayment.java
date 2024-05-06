package com.assignment.paymentsystem;

public class CashPayment implements PaymentMethod {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Cash payment received");
	}

	@Override
	public void refundPayment() {
		// TODO Auto-generated method stub
		System.out.println("Cash refund");
	}

}
