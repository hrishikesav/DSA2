package com.hrishi.designpatterns.state;

public class OrderContext {
    private OrderState orderState;

    public void setState(OrderState state) {
        orderState = state;
    }

    public void processState() {
        orderState.changeState();
    }
}
