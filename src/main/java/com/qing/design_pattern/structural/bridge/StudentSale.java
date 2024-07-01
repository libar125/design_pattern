package com.qing.design_pattern.structural.bridge;

public class StudentSale extends AbstractSale {

    public StudentSale(String type, Integer price) {
        super(type, price);
    }

    @Override
    public void howToSale() {
        //
    }
}
