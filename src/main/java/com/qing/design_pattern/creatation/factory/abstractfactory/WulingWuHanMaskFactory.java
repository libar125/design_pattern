package com.qing.design_pattern.creatation.factory.abstractfactory;

public class WulingWuHanMaskFactory extends AbstractMaskFactory {
    @Override
    public AbstractMask createMask() {
        return new N95Mask();
    }
}
