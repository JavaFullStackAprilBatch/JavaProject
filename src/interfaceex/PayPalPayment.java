package javaproj.assignment.interfaceex;

public class PayPalPayment implements PaymentMethod {
	String customerName, paypalNumber;
	
	public PayPalPayment(String custName, String paypalNo){
		this.customerName = custName;
		this.paypalNumber = paypalNo;
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer Name: " + customerName + "\nPayPal Account Number: " + paypalNumber +  "\nPayPal Account: Payment of " + amount + " processed\n\n");
		
	}

	@Override
	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer Name: " + customerName + "\nPayment of " + amount + " refunded in ur Paypal account\n\n");
		
	}
	
}
