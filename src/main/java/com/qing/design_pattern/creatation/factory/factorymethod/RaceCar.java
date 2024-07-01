package com.qing.design_pattern.creatation.factory.factorymethod;

public class RaceCar extends AbstractCar{
    public String engine = "v8发动机";

    @Override
    public void run() {
        System.out.println(engine+"=====>嗖嗖嗖 跑的飞快......");
    }
}
