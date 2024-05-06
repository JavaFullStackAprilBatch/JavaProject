package Interface;

public class Cashpayment implements PaymentMethod {
	String customername;
	
	public Cashpayment(String customername) {
		this.customername=customername;
		
	}

	@Override
	public void processpayment(double amount) {
		
		// TODO Auto-generated method stub
		System.out.println("cash process payment"+amount);
	}

	@Override
	public void refundpayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("cash refufnd payments"+amount);
		
		
	}
	

}
