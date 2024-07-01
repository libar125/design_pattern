package com.qing.design_pattern.creatation.prototype;


/**
 * 是用于创建重复的对象，同时又能保证性能。
 * 1、GuiguMyBatis：操作数据库，从数据库里面查出很多记录（70%改变很少）
 * 2、每次查数据库，查到以后把所有数据都封装一个对象，返回。
 *    10000 thread：查一个记录： new User("zhangsan",18)；每次创建一个对象封装并返回
 *    系统里面就会有10000个User;浪费内存
 * 3、解决：缓存；查过的保存。
 *          如果再查相同的记录，拿到原来的原型对象
 *
 * 4、此时直接拿到缓存中的对象。
 *
 *
 */
public class MainTest {


    public static void main(String[] args) throws CloneNotSupportedException {
        QingMybatis qingMybatis = new QingMybatis();

        User user1 = qingMybatis.getUser("zhangsan");
        System.out.println("user1==>"+user1);
        user1.setName("lisi");

        User user2 = qingMybatis.getUser("zhangsan");
        System.out.println("user2==>"+user2);

        User user3 = qingMybatis.getUser("zhangsan");
        System.out.println("user3==>"+user3);

        User user4 = qingMybatis.getUser("zhangsan");
        System.out.println("user4==>"+user4);

    }
}
