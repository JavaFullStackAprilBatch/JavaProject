package Interface;

public class Client {
	
	public static void main(String a[])
	{
		PaymentMethod creditcard=new Creditcardpayment("1567845","12/19","896");
		PaymentMethod paypal=new Paypalpayment("savita@gmail.com","pass2567");
		PaymentMethod Cash=new Cashpayment("3456");
		
		creditcard.processpayment(56098);
		creditcard.refundpayment(456756);
		
		paypal.processpayment(4359);
		paypal.refundpayment(47890);
		
		Cash.processpayment(3489);
		Cash.refundpayment(34578);
		
		
		
		
	}

}
