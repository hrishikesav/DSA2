package com.hrishi.designpatterns.state;

public class ItemState implements OrderState{

    @Override
    public void changeState() {
        System.out.println("Item state of order changed.");
    }
}
