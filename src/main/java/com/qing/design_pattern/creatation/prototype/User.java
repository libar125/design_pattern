package com.qing.design_pattern.creatation.prototype;

import lombok.Data;

@Data
public class User implements Cloneable {
    private String name;
    private int age;


    /**
     * 再创建一个人，赋予我的所有属性
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
