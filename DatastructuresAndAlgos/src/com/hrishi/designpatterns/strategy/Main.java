package com.hrishi.designpatterns.strategy;

public class Main {

    public static void main(String[] args) {
        TenderContext tenderContext = new TenderContext(new CreditCardTender());
        tenderContext.processTender();
    }
}
