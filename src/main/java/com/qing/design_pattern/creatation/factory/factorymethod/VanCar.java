package com.qing.design_pattern.creatation.factory.factorymethod;

import com.qing.design_pattern.creatation.factory.simplefactory.AbstractCar;
import lombok.Data;

@Data
public class VanCar extends AbstractCar {

    String engine = "单杠柴油机";

    @Override
    public void run() {
        System.out.println(engine+"--》嗒嗒嗒....");
    }
}
