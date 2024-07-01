package com.qing.design_pattern.structural.bridge;

public abstract class AbstractPhone {

    /**
     *桥接在此.....设计期间就得想好
     * 【真正会引起此类变化的一个维度直接抽取出来，通过组合的方式接起来】
     *
     * 桥接 + 适配器(低价甩卖)
     */
    public AbstractSale sale;

    abstract String getInfo();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }
}
