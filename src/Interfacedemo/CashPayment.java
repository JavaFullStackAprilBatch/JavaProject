package Interfacedemo;

public class CashPayment  implements Paymentmethod{
	String cname;
    public CashPayment(String cname) {
    	this.cname=cname;
    }
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println( "Customer "+cname+ "paid amount " +amount);
		
	}

	@Override
	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount" +amount+ "returned to customer " +cname);
	}
	

}
