package com.qing.design_pattern.creatation.factory.abstractfactory;

import com.qing.design_pattern.creatation.factory.factorymethod.AbstractCar;

public class MainTest {
    public static void main(String[] args) {
        WulingWuHanMaskFactory wuHanMaskFactory = new WulingWuHanMaskFactory();
        AbstractMask mask = wuHanMaskFactory.createMask();
        mask.protectedMe();


        WulingRaceFactory wulingRaceFactory = new WulingRaceFactory();
        AbstractCar car = wulingRaceFactory.createCar();
        car.run();
    }
}
