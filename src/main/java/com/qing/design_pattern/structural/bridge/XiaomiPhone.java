package com.qing.design_pattern.structural.bridge;

public class XiaomiPhone extends AbstractPhone{
    @Override
    public String getInfo() {
        return "小米手机"+sale.getSaleInfo();
    }
}
