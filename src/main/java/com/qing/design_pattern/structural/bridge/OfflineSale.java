package com.qing.design_pattern.structural.bridge;

public class OfflineSale extends AbstractSale {

    public OfflineSale(String type, Integer price) {
        super(type, price);
    }

    @Override
    public void howToSale() {
        //
    }
}
