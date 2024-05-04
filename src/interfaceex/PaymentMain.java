package javaproj.assignment.interfaceex;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod creditPay = new CreditCardPayment("Ajay","1234 5678 1234");
		PaymentMethod cashPay = new CashPayment("Nithila");
		PaymentMethod palPay = new PayPalPayment("Harsha", "1234565");
		
		creditPay.processPayment(12980);
		creditPay.refundPayment(6270);
		cashPay.processPayment(2980);
		cashPay.refundPayment(2708);
		palPay.processPayment(9000);
		palPay.refundPayment(6789);
			

	}

}
