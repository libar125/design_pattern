package com.qing.design_pattern.structural.decorator;

/**
 * 向一个现有的对象添加新的功能，同时又不改变其结构。属于对象结构型模式。
 * 创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 *
 * 抽象构件（Component）角色： 定义一个抽象接口以规范准备接收附加责任的对象。
 *
 * 具体构件（ConcreteComponent）角色： 实现抽象构件，通过装饰角色为其添加一些职责。
 *
 * 抽象装饰（Decorator）角色： 继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 *
 * 具体装饰（ConcreteDecorator）角色： 实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 *
 */
public class KeyInfo {
}
