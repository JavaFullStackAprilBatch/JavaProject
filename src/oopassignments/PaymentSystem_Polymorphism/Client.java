package oopassignments.PaymentSystem_Polymorphism;

public class Client {

	public static void main(String[] args) {
		
        PaymentMethod cc = new CreditCardPayment();
        cc.processPayment(100.0);
        cc.refundPayment(50.0);

        PaymentMethod pp = new PayPalPayment();
        pp.processPayment(80.0);
        pp.refundPayment(30.0);

        PaymentMethod cp = new CashPayment();
        cp.processPayment(120.0);
        cp.refundPayment(70.0);

	}

}
