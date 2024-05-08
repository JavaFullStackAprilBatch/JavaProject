package paymentmethod;

public interface IpaymentMethod {
    public void processPayment(int amount);
    void refundPayment(int amount);
}
