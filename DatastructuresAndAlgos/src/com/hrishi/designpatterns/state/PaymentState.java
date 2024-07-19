package com.hrishi.designpatterns.state;

public class PaymentState implements OrderState{

    @Override
    public void changeState() {
        System.out.println("Payment state of order changed.");
    }
}
