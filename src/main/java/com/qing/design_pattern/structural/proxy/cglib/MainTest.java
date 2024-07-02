package com.qing.design_pattern.structural.proxy.cglib;

public class MainTest {
    public static void main(String[] args) {
//        CglibProxy cglibProxy = new CglibProxy();
//        QingTiktok proxy = cglibProxy.createProxy(new QingTiktok());
//        System.out.println(proxy.sayHello());

        QingTiktok proxy = CglibProxy1.createProxy(new QingTiktok());
        System.out.println(proxy.sayHello());
    }
}
