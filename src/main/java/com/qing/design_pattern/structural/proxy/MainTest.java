package com.qing.design_pattern.structural.proxy;

import com.qing.design_pattern.structural.proxy.statics.SomeoneProxy;
import com.qing.design_pattern.structural.proxy.statics.Zhengs;

public class MainTest {
    public static void main(String[] args) {
        SomeoneProxy someoneProxy = new SomeoneProxy(new Zhengs());
        System.out.println(someoneProxy.getBaby());
    }

}
