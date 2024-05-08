package Interfacedemo;

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paymentmethod cash=new CashPayment("siri");
		Paymentmethod credit=new CreditCardPayment("rekha", "4567 6789 2314");
		Paymentmethod paypal=new PaypalPayment("hari","abc@gmail.com");
		cash.processPayment(19086);
		cash.refundPayment(34567);
		credit.processPayment(345678);
		credit.refundPayment(24567);
		paypal.processPayment(71345);
		paypal.refundPayment(3437);
	}

}
