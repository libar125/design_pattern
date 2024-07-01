package com.qing.design_pattern.creatation.factory.simplefactory;

/**
 * 简单工厂
 * 1、产品数量极少
 */
public class WulinFactory {

    public AbstractCar getCar(String carType) {
        AbstractCar car = null;
        switch (carType) {
            case "mini":
                car = new MiniCar();
                break;
            case "van" :
                car = new VanCar();
                break;
        }
        return car;
    }
}
