package com.qing.design_pattern.structural.proxy.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy1 {
    //为任意对象创建代理
    public static <T> T createProxy(T t){

        Enhancer enhancer = new Enhancer();
        // 为加强器指定要代理的业务类（即为下面生成的代理类指定父类）
        enhancer.setSuperclass(t.getClass());
        // 设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("代理对象增强调用");
                Object invoke = methodProxy.invokeSuper(o,objects);
                return invoke;
            }
        });
        return (T) enhancer.create();
    }
}
