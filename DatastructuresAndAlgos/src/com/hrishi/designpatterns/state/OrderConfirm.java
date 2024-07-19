package com.hrishi.designpatterns.state;

public class OrderConfirm {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.setState(new PaymentState());
        orderContext.processState();

        orderContext.setState(new ItemState());
        orderContext.processState();
    }
}
