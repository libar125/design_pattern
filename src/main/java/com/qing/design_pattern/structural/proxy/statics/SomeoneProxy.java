package com.qing.design_pattern.structural.proxy.statics;

public class SomeoneProxy extends People{
    private People people;

    public SomeoneProxy(People people) {
        this.people = people;
    }

    @Override
    public String getBaby() {
        pregnancy();
        nourish();
        product();
        return people.getBaby();
    }


    public void pregnancy(){
        System.out.println("someone怀孕");
    }


    public void nourish(){
        System.out.println("someone养胎中");
    }

    public void product(){
        System.out.println("someone顺利生产");
    }
}
