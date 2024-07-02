package com.qing.design_pattern.structural.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkInvocationProxy<T> implements InvocationHandler {

    T target;

    public JdkInvocationProxy(T target) {
        this.target = target;
    }

    public T getProxy(T target) {
        Object o = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), //必须接口
               this);

        return (T) o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //反射执行
        System.out.println("真正执行被代理对象的方法");
        Object invoke = method.invoke(target, args);
        return invoke;
    }

}