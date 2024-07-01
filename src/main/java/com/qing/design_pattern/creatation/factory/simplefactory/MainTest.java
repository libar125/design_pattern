package com.qing.design_pattern.creatation.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {

        WulinFactory wulinFactory = new WulinFactory();
        //开走mini小汽车
        AbstractCar mini = wulinFactory.getCar("mini");
        mini.run();

        //开走货车
        AbstractCar van = wulinFactory.getCar("van");
        van.run();

    }
}
