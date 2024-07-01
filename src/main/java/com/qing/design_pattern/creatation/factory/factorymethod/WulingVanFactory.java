package com.qing.design_pattern.creatation.factory.factorymethod;

public class WulingVanFactory extends AbstractFactory{
    @Override
    public AbstractCar createCar() {
        return new RaceCar();
    }
}
