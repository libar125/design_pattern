package com.qing.design_pattern.structural.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    //为任意对象创建代理
    public <T> T createProxy(T t){

        Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的业务类（即为下面生成的代理类指定父类）
        enhancer.setSuperclass(t.getClass());
        // 设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("cglib上场le .......xxx");
            Object invoke = methodProxy.invokeSuper(obj,args);
            return invoke;
    }
}
