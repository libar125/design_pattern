package com.qing.design_pattern.creatation.factory.factorymethod;

public class WulingMiniFactory extends AbstractFactory{
    @Override
    public AbstractCar createCar() {
        return new MiniCar();
    }
}
