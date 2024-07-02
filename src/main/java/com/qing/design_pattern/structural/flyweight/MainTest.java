package com.qing.design_pattern.structural.flyweight;

public class MainTest {
    public static void main(String[] args) {
        RedRomanceFactory redRomanceFactory = new RedRomanceFactory();


        //qing
        AbstractWaitressFlyweight waitress = redRomanceFactory.getWaitress("1022");
        waitress.service();
        System.out.println(waitress);

        //libar
        AbstractWaitressFlyweight waitress1 = redRomanceFactory.getWaitress("72");
        waitress1.service();
        System.out.println(waitress1);

        AbstractWaitressFlyweight waitress2 = redRomanceFactory.getWaitress("81");

        waitress.end();

        AbstractWaitressFlyweight waitress3 = redRomanceFactory.getWaitress("72");
        waitress3.service();

    }
}
