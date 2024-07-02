package com.qing.design_pattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BeautifulWaitress extends AbstractWaitressFlyweight{
    String id;//工号
    String name;//名字
    int age;//年龄



    @Override
    void service() {
        //改变内部状态
        this.canService = false;

        System.out.println("开始按脚");
    }

    @Override
    void end() {
        //改变内部状态
        this.canService = true;
        System.out.println("不加个钟吗");
    }
}
