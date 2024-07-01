package com.qing.design_pattern.creatation.factory.abstractfactory;

public abstract class AbstractCarFactory extends AbstractFactory {

    @Override
    public AbstractMask createMask(){
        return null;
    }
}
