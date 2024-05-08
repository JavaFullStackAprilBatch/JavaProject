package paymentmethod;

public class PaymentMain {
    public static void main(String[] args) {
        CashPayment obj=new CashPayment("Miles");
        CreditCardPayment obj1=new CreditCardPayment("Brayden",567234);
        PaypalPayment obj2=new PaypalPayment("John",12356);
        obj.processPayment(1200);
        obj.refundPayment(234);
        obj1.processPayment(2345);
        obj1.refundPayment(234);
        obj2.processPayment(8796);
        obj2.refundPayment(567);


    }
}
