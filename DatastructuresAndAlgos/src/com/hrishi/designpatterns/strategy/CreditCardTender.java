package com.hrishi.designpatterns.strategy;

public class CreditCardTender implements TenderStrategy{

    @Override
    public void processTender() {
        System.out.println("CreditCardTender.processTender");
    }
}
