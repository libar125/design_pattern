package com.qing.design_pattern.behavior.state;

/**
 *
 * 状态模式 : 允许 对象 在 内部状态 改变时 , 改变它的行为 ;
 *
 * 一个对象 , 如果其 内部状态改变 , 其 行为也需要进行改变 ; 如果其行为不需要改变 , 也可以只 控制 该对象的状态 的 互相转换 ;
 *
 * 当控制一个对象 , 其状态转换过程比较复杂时 , 将 状态判断逻辑 , 转到代表不同状态的一系列类中 ;
 *
 * 如 : 引入 视频播放 的业务场景 , 播放器有 初始状态 , 播放状态 , 暂停状态 , 停止状态 , 快进状态 等多种状态 , 将这些 状态 都封装到 代表不同状态的类 中 , 可以将复杂的判断逻辑简化 , 将这些 逻辑 扩展到不同的状态类中 ;
 *
 * 状态模式适用场景 : 一个对象 , 存在多个状态 , 状态可以相互转换 ; 不同状态下 , 行为不同 ;
 *
 *
 * 不同状态下 , 行为不同的示例 , 如 :
 *
 * 购买物品 , 将物品放入购物车并生成订单 , 可以进行付款 ; 如果 订单 超过 24 小时后 , 被关闭订单 , 此时订单取消 , 无法付款 ;
 *
 * 电梯运行时 , 不能开门 ; 电梯停止后 , 才能开门 ;
 *
 *
 * 状态模式优点 :
 *
 * 可以将 不同的状态 隔离 ; 每个状态都是一个单独的类 ;
 *
 * 可以将 各种状态 的 转换逻辑 , 分布到 状态 的子类中 , 减少相互依赖 ;
 *
 * 增加 新状态 , 操作简单 ;
 *
 *
 * 状态模式缺点 :
 *
 * 如果 状态数量 比较多 , 状态类 的 数量会增加 , 业务场景系统变得很复杂 ; 如果业务中某个对象由几十上百个状态 , 就会很复杂 , 这时就需要对状态进行拆分处理 ;
 *
 * 状态模式 与 享元模式 , 可以配合在一起使用 , 可以使用享元模式 , 在多个上下文中 , 共享状态实例 ;
 */
public class KeyInfo {
}