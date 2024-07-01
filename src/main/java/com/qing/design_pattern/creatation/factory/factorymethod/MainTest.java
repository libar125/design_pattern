package com.qing.design_pattern.creatation.factory.factorymethod;

public class MainTest {
    public static void main(String[] args) {


        WulingMiniFactory wulingMiniFactory = new WulingMiniFactory();
        AbstractCar car = wulingMiniFactory.createCar();
        car.run();

        WulingRaceFactory wulingRaceFactory = new WulingRaceFactory();
        AbstractCar car1 = wulingRaceFactory.createCar();
        car1.run();

    }
}
