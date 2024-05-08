package Interfacedemo;

public class PaypalPayment implements Paymentmethod {
	String customername;
	String paypalemailid;
	PaypalPayment(String cname,String email){
		
		this.customername=cname;
		this.paypalemailid=email;
		
	}
	
	public void processPayment(double amount) {
		System.out.println( "Customer "+customername+ "paid amount " +amount+ "Paid to emailid via paypal");
		
	}
	public void refundPayment(double amount) {
		System.out.println("Amount" +amount+ "returned to customer " +customername);
	}
		
	}
	

