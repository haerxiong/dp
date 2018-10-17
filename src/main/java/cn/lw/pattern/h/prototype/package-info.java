/**
 * 原型模式
 *
 * 对象的获取在一个复杂或耗时的过程后，如数据库操作，我们可以缓存该对象，在下一个请求时返回它的克隆。
 *
 * 注：
 *  java中Object类的clone方法可以复制基本类型与String类型，引用类型需要实现clone方法方可
 *
 * Created by VictorLiu on 2018/10/17.
 */
package cn.lw.pattern.h.prototype;