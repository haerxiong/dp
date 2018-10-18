/**
 * 观察者模式
 *
 * 对象间存在“一对多”关系，对象被修改时，通知它的依赖对象。
 *
 * 注意：
 *   1、JAVA已有支持类。 2、避免循环引用。 3、一般采用异步方式。
 *
 * e.g.
 *
 * Spring事件机制：context充当事件发布者，自定义实现listener接口的可以接收事件。
 *
 * Created by VictorLiu on 2018/10/18.
 */
package cn.lw.pattern.i.observer;