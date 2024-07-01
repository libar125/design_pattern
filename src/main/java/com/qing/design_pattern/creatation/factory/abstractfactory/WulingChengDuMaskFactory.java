package com.qing.design_pattern.creatation.factory.abstractfactory;

public class WulingChengDuMaskFactory extends AbstractMaskFactory {
    @Override
    public AbstractMask createMask() {
        return new CommonMask();
    }
}
