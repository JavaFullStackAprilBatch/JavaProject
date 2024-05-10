package com.bhuvama.workspace;

import java.util.Date;

public interface PaymentMethod {

    public void processPayment(double amount, Date processeddate);
    public void refundPayment(double amount, Date refunddate);
}
