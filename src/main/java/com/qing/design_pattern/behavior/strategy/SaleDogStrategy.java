package com.qing.design_pattern.behavior.strategy;

public class SaleDogStrategy implements RngStrategy{
    @Override
    public void warStrategy() {
        System.out.println("uiz去勾引");
    }
}
