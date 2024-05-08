package Interfacedemo;

public class CreditCardPayment implements Paymentmethod {
	String cname;
	String cardno;
	public CreditCardPayment(String cname,String cardno){
		this.cname=cname;
		this.cardno=cardno;
	}
	public void processPayment(double amount) {
		System.out.println( "Customer "+cname+ "paid amount " +amount+ "Paid via creditcard ");
	}
	@Override
	public void refundPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount" +amount+ "returned to customer " +cname+ "via credit card");
		
	}
	

}
