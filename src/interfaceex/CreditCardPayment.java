package javaproj.assignment.interfaceex;

public class CreditCardPayment implements PaymentMethod{
	String customerName, cardNumber;
	
	public CreditCardPayment(String custName, String cardNo){
		this.customerName = custName;
		this.cardNumber = cardNo;
		
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer Name: " + this.customerName + "\n Card No: " + this.cardNumber +  "\nCredit card Authenticated \nPayment of amount " + amount + "processed\n\n");
		
	}

	@Override
	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Customer Name: " + customerName + "\nPayment of " + amount + " refunded in ur Credit Card\n\n");
		
	}
	

}
