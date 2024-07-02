package com.qing.design_pattern.structural.proxy.jdkproxy;

public class MainTest {

    public static void main(String[] args) {

        QingTiktok qingTiktok = new QingTiktok();
        JdkInvocationProxy<ManTiktok> proxy = new JdkInvocationProxy<ManTiktok>(qingTiktok);
        ManTiktok proxy1 = proxy.getProxy(qingTiktok);

        System.out.println(proxy1.sayHello());

    }
}
