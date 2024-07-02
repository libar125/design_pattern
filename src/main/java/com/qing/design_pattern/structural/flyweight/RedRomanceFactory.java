package com.qing.design_pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class RedRomanceFactory {

    private static Map<String,AbstractWaitressFlyweight> waitressPool = new HashMap<>();


    //享元，池子中有对象
    static {
        BeautifulWaitress waitress =
                new BeautifulWaitress("81","张三",18);


        BeautifulWaitress waitress2 =
                new BeautifulWaitress("72","李四",20);

        waitressPool.put(waitress2.id,waitress2);
        waitressPool.put(waitress.id,waitress);
    }

    public void addWaitress(AbstractWaitressFlyweight waitressFlyweight){
        waitressPool.put(UUID.randomUUID().toString(),waitressFlyweight);
    }


    public  AbstractWaitressFlyweight getWaitress(String id){
        AbstractWaitressFlyweight flyweight = waitressPool.get(id);
        if(flyweight == null || !flyweight.canService){
            return getOneWaitress();
        }
        return flyweight;
    }


    public AbstractWaitressFlyweight getOneWaitress(){
        AbstractWaitressFlyweight waitress = null;
        for (AbstractWaitressFlyweight value : waitressPool.values()) {
            if(value.isCanService()){
                waitress = value;
            }
        }

        if(waitress == null){
            System.out.println("没有技师了 暂停服务");
        }
        return waitress;
    }
}
