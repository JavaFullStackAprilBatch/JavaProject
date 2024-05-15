//package javaproj.assignment.interfacex;

public class CashPayment implements PaymentMethod{
	String customerName;
	public CashPayment(String custName) {
		this.customerName = custName;
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer Name: " + this.customerName +"\nPayment in Cash: " + amount + "\n\n");
		
	}

	@Override
	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer Name: " + this.customerName + "\nCash Refund: " + amount + "\n\n");
	}
	
	

}
