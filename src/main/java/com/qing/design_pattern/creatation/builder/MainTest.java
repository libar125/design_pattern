package com.qing.design_pattern.creatation.builder;

public class MainTest {
    public static void main(String[] args) {
//        //想要一台小米手机
//        XiaomiPhoneBuilder xiaomiPhoneBuilder = new XiaomiPhoneBuilder();
//        xiaomiPhoneBuilder.customCpu("晓龙888");
//        xiaomiPhoneBuilder.customMemory("12GB");
//        xiaomiPhoneBuilder.customDisk("1TB");
//        xiaomiPhoneBuilder.customCamera("1亿像素");
//
//        Phone product = xiaomiPhoneBuilder.getProduct();
//        System.out.println(product);

//        //再来一台小米手机
//        XiaomiPhoneBuilder builder = new XiaomiPhoneBuilder();
//        Phone xiaomiS1 = builder.customCpu("小米1代芯片").
//                customCamera("自研相机").
//                customDisk("8T超级大硬盘").
//                customMemory("1GB 够用就行").
//                getProduct();
//        System.out.println(xiaomiS1);


        //再买一台
        Phone xiaomi11 = Phone.builder()
                .cpu("小米超级11代")
                .mem("100GB 超级大内存")
                .camera("100亿像素 都能当天文望远镜使用")
                .disk("2KB  还要啥硬盘啊")
                .build();
        System.out.println(xiaomi11);

    }
}
