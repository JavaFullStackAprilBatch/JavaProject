package oopassignments.PaymentSystem_Polymorphism;

public class PayPalPayment implements PaymentMethod {
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}
	
	@Override
	public void refundPayment(double amount) {
		System.out.println("Refunding PayPal payment of $" + amount);
	}

}
