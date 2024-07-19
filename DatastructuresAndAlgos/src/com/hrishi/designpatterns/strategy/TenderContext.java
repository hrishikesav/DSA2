package com.hrishi.designpatterns.strategy;

public class TenderContext {

    private TenderStrategy tenderStrategy;

    public TenderContext(TenderStrategy tenderStrategy) {
        this.tenderStrategy = tenderStrategy;
    }

    public void processTender() {
        tenderStrategy.processTender();
    }
}
