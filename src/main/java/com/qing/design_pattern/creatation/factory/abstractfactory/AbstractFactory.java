package com.qing.design_pattern.creatation.factory.abstractfactory;

import com.qing.design_pattern.creatation.factory.factorymethod.AbstractCar;


public abstract class AbstractFactory {
    /**
     * 五菱总厂规定
     */
    public String rules;


    public abstract AbstractCar createCar();


    public abstract AbstractMask createMask();

}
