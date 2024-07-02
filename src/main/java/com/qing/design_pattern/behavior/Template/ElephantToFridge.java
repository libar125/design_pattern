package com.qing.design_pattern.behavior.Template;

public class ElephantToFridge extends AnimalToFridge{
    @Override
    public void putIntoFridge() {
        System.out.println("把大象放进去");
    }
}
