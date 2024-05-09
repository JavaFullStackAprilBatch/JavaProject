package com.Interfaces;

public  class CashPayment  implements  PaymentMethod1 {


    public int processPayment(int id, int amount, String description) {
        System.out.println(id);
        return id;
    }

    public int refundPayment(int id, int total, float balance) {
       System.out.println(total);
        return total;
    }
}
