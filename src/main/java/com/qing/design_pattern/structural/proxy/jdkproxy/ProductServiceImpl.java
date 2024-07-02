package com.qing.design_pattern.structural.proxy.jdkproxy;

public class ProductServiceImpl implements ProductService {
    @Override
    public void addProduct(String productName) {
        System.out.println("产品正在添加"+productName);
    }
}
