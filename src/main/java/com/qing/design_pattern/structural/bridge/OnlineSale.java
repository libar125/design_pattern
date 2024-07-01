package com.qing.design_pattern.structural.bridge;

public class OnlineSale extends AbstractSale {

    public OnlineSale(String type, Integer price) {
        super(type, price);
    }

    @Override
    public void howToSale() {
        //
    }
}
