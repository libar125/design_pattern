package com.qing.design_pattern.creatation.factory.abstractfactory;

import com.qing.design_pattern.creatation.factory.factorymethod.AbstractCar;
import com.qing.design_pattern.creatation.factory.factorymethod.AbstractFactory;
import com.qing.design_pattern.creatation.factory.factorymethod.RaceCar;

public class WulingVanFactory extends AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return new RaceCar();
    }
}
