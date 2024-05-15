package com.bhuvama.workspace.employee;

import java.util.Date;

public interface PaymentMethod {

    public void processPayment(double amount, Date processeddate) throws Exception;
    public void refundPayment(double amount, Date refunddate);
}
