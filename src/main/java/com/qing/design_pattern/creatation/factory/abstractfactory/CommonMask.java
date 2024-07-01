package com.qing.design_pattern.creatation.factory.abstractfactory;

/**
 * 具体产品
 */
public class CommonMask extends AbstractMask{
    public CommonMask(){
        this.price = 1;
    }

    @Override
    public void protectedMe() {
        System.out.println("普通口罩,仅需:"+price+" 请记得及时更换");
    }
}
