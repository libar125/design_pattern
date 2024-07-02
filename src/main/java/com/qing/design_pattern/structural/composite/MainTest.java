package com.qing.design_pattern.structural.composite;

public class MainTest {
    public static void main(String[] args) {
        Menu root = new Menu(1, "系统管理");

        Menu juese = new Menu(2, "角色管理");
        root.addChild(juese);
        juese.addChild(new Menu(6,"固定角色"));
        juese.addChild(new Menu(7,"临时授予"));

        Menu yonghu = new Menu(3, "用户管理");
        root.addChild(yonghu);

        yonghu.addChild(new Menu(4,"临时用户"));
        yonghu.addChild(new Menu(5,"注册用户"));


        root.print(root);

    }
}
