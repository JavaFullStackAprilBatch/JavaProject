package Interface;

public class Paypalpayment implements PaymentMethod{
	
	String email;
	String password;
	
	public Paypalpayment(String email,String password) {
		this.email=email;
		this.password=password;
	}

	@Override
	public void processpayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("paypal processing payments" +amount);
		
	}

	@Override
	public void refundpayment(double amount) {
		System.out.println("paypalrefund payments" +amount);
		
		
		
	}
	

}
