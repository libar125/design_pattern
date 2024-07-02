package com.qing.design_pattern.behavior.Template;

/**
 * 模板方法模式定义了一个操作中的算法的框架，而将一些步骤延迟到子类中。
 * 使得子类可以不改变一个算法的结构即可重定义该算法的某些步骤。
 *
 * 延迟到子类其实就是子类继承并实现父类中的抽象方法(abstract)，
 * 而重定义该算法的某些步骤指的就是子类重写父类的虚方法(virtual)。
 * 不过，不管是哪一个，子类都需要用到override。
 */
public class keyInfo {
}
