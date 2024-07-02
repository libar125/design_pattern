package com.qing.design_pattern.behavior.strategy;

public class KeepDogStrategy implements RngStrategy {
    @Override
    public void warStrategy() {
        System.out.println("保护uiz");
    }
}
