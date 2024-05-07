package oopsassignment;

public interface PaymentMethod {
/*2. PaymentSystem* : Create a PaymentMethod interface with methods processPayment() and refundPayment(). 
 Implement this interface with classes  CreditCardPayment, PayPalPayment, and CashPayment, each providing its implementation for payment processing.*/

	 void processPayment(int amount);
	 void refundPayment(int amount);
    }
 class CreditCardPayment implements PaymentMethod
	{
		public  void processPayment(int amount)
		{
			System.out.println("credit card payment :"+amount);
		}
		public void  refundPayment(int amount)
		{
			System.out.println("refund card payment :"+amount);
		}
		
		}
 class PayPalPayment implements PaymentMethod
	{
		public  void processPayment(int amount)
		{
			System.out.println("Paypal card payment :"+amount);
			
		}
		public void  refundPayment(int amount)
		{
			System.out.println("paypal refund card payment :"+amount);
		}
	}
		
 class CashPayment implements PaymentMethod
	{
		public  void processPayment(int amount)
		{
			System.out.println("cash card payment :"+amount);
			
		}
		public void  refundPayment(int amount)
		{
			System.out.println("cash refund card payment :"+amount);
		}
		
	}
	
		

	
		


