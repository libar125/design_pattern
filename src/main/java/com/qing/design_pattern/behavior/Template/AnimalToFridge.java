package com.qing.design_pattern.behavior.Template;

public abstract class AnimalToFridge {

    public void begin(){
        openFridge();
        putIntoFridge();
        closeFridge();
    };

    private void openFridge(){
        System.out.println("Close fridge");
    }

    public abstract void putIntoFridge();

    private void closeFridge(){
        System.out.println("Close fridge");
    }

}
