package com.qing.design_pattern.structural.bridge;

/**
 * 将抽象与实现解耦，使两者都可以独立变化
 *
 * 桥接（Bridge）模式包含以下主要角色。
 * 系统设计期间，如果这个类里面的一些东西，会扩展很多，这个东西就应该分离出来
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 */
public class KeyInfo {
}
