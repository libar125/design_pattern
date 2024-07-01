package com.qing.design_pattern.creatation.factory.abstractfactory;


import com.qing.design_pattern.creatation.factory.factorymethod.AbstractCar;
import com.qing.design_pattern.creatation.factory.factorymethod.MiniCar;

public class WulingMiniFactory extends AbstractCarFactory {

    @Override
    public AbstractCar createCar() {
        return new MiniCar();
    }
}
