package com.qing.design_pattern.creatation.factory.abstractfactory;

/**
 * 具体产品
 */
public class N95Mask  extends AbstractMask{
    public N95Mask(){
        this.price = 5;
    }

    @Override
    public void protectedMe() {
        System.out.println("单个售价:"+price+"N95口罩....超级防护");
    }
}
