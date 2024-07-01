package com.qing.design_pattern.creatation.singleton.type07;

public class Singleton {

    private Singleton(){
    }

    static class SingletonInstance{
        private static Singleton instance = new Singleton();
    }

    private static Singleton getInstance(){
        return SingletonInstance.instance;
    }
}
