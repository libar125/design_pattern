package com.qing.design_pattern.creatation.factory.abstractfactory;



public class RacingCar extends AbstractCar {

    public RacingCar(){
        this.engine = "v8发动机";
    }
    @Override
    public void run() {
        System.out.println(engine+"=--嗖.....");
    }
}
