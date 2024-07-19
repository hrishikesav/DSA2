package com.hrishi.designpatterns.strategy;

public class GiftCardTender implements TenderStrategy{

    @Override
    public void processTender() {
        System.out.println("GiftCardTender.processTender");
    }
}
