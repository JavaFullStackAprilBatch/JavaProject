package oopassignments.PaymentSystem_Polymorphism;

public class CreditCardPayment implements PaymentMethod {
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Credit card payment of $" + amount);
	}
	
	@Override
	public void refundPayment(double amount) {
		System.out.println("Refunding Credit card payment of $" + amount);
	}

}
