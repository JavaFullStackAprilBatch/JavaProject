package oopsassignment;

import oopsassignment.PaymentMethodMain.Paymentmethod;

public class PaymentMethodMain {

	public class Paymentmethod {

	}

	public static void main(String[] args) {
		
	CreditCardPayment CreditCard =new  CreditCardPayment();
	
	PayPalPayment paypal =new PayPalPayment();
	
	 CashPayment cash =new  CashPayment();
	 
	 CreditCard.processPayment(200);
	 CreditCard.refundPayment(100);
	 
	 paypal.processPayment(300);
	 paypal.refundPayment(200);
	 
	 
	 cash.processPayment(400);
	 cash.refundPayment(300);
	
		

	}

}
