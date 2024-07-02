package com.qing.design_pattern.structural.facade;

public class MainTest {
    public static void main(String[] args) {
        WeiXinFacade weiXinFacade = new WeiXinFacade();
        weiXinFacade.oneButton("张学龙");
    }
}
