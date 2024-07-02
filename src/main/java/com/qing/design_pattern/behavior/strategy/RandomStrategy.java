package com.qing.design_pattern.behavior.strategy;

public class RandomStrategy implements RngStrategy{
    @Override
    public void warStrategy() {
        System.out.println("打这个 打这个");
    }
}
