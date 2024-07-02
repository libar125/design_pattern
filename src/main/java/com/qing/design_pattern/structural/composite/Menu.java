package com.qing.design_pattern.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {

    private Integer id;

    private String name;

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private List<Menu> childList = new ArrayList<Menu>();

    void addChild(Menu child) {
        childList.add(child);
    };

    void print(Menu menu) {
        System.out.println(menu.getName());
        if (!menu.childList.isEmpty()) {
            for (Menu child : menu.childList) {
                child.print(child);
            }
        }
    }



}
