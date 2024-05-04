package oopassignments.PaymentSystem_Polymorphism;

public class CashPayment implements PaymentMethod {
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Cash payment of $" + amount);
	}
	
	@Override
	public void refundPayment(double amount) {
		System.out.println("Refunding Cash payment of $" + amount);
	}

}
