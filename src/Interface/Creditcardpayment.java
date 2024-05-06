package Interface;

public class Creditcardpayment implements PaymentMethod  {
	
	String cardnumber;
	String expirydate;
	String cvv;
	

	public Creditcardpayment(String cardnumber,String expirydate,String cvv) {
		
		this.cardnumber=cardnumber;
		this.expirydate=expirydate;
		this.cvv=cvv;
		
	}
	@Override
	public void processpayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("processing creditcard payments"+ amount);
		
	}

	@Override
	public void refundpayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("refund creditcard payments"+ amount);
		
		
	}

}
