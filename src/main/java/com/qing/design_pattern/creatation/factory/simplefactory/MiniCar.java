package com.qing.design_pattern.creatation.factory.simplefactory;

import lombok.Data;

@Data
public class MiniCar extends AbstractCar {

    public String engine = "四缸水平对置发动机";


    @Override
    public void run() {
        System.out.printf(engine+"----> 滴滴滴滴");
    }
}
