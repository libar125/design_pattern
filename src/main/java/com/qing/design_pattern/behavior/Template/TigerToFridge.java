package com.qing.design_pattern.behavior.Template;

public class TigerToFridge extends AnimalToFridge{
    @Override
    public void putIntoFridge() {
        System.out.println("把老虎放进去");
    }
}
