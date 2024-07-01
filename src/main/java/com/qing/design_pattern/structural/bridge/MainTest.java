package com.qing.design_pattern.structural.bridge;

public class MainTest {
    public static void main(String[] args) {

        HuaweiPhone huaweiPhone = new HuaweiPhone();
        huaweiPhone.setSale(new OfflineSale("offline",4000));
        System.out.println(huaweiPhone.getInfo());
        huaweiPhone.setSale(new StudentSale("student",0));
        System.out.println(huaweiPhone.getInfo());


        XiaomiPhone xiaomi = new XiaomiPhone();
        xiaomi.setSale(new OnlineSale("online",1999));
        System.out.println(xiaomi.getInfo());


        xiaomi.setSale(new PddSale("pdd",999));
        System.out.println(xiaomi.getInfo());
    }
}
