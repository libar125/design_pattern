package com.qing.design_pattern.structural.bridge;


public class HuaweiPhone extends AbstractPhone {
    @Override
    String getInfo() {
        return "华为手机"+sale.getSaleInfo();
    }
}
