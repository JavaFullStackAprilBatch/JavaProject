package oopassignments.PaymentSystem_Polymorphism;

public interface PaymentMethod {

	public void processPayment(double amount);
    public void refundPayment(double amount);
}
