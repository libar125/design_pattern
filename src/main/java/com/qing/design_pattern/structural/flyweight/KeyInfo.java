package com.qing.design_pattern.structural.flyweight;

/**
 * 在享元模式中可以共享的相同内容称为内部状态(IntrinsicState)，
 * 而那些需要外部环境来设置的不能共享的内容称为外部状态(Extrinsic State)，
 * 由于区分了内部状态和外部状态，
 * 因此可以通过设置不同的外部状态使得相同的对象可以具有一些不同的特征，
 * 而相同的内部状态是可以共享的。
 * 在享元模式中通常会出现工厂模式，
 * 需要创建一个享元工厂来负责维护一个享元池(Flyweight Pool)用于存储具有相同内部状态的享元对象。
 *
 * 享元模式包含如下角色：
 * Flyweight: 抽象享元类  Connection
 * ConcreteFlyweight: 具体享元类  ConnectionImpl（user,pwd,url）
 * UnsharedConcreteFlyweight: 非共享具体享元类ConnectionImpl（state）
 * FlyweightFactory: 享元工厂类；简单工厂，产品就一个Connection
 */
public class KeyInfo {
}
