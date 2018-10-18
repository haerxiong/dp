/**
 * 策略模式
 *
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决if...else带来的复杂和难以维护
 *
 * e.g.
 *  springMVC的HandlerMethodArgumentResolverComposite(包括了组合模式)
 *
 * 注：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
 *
 *
 * 易混淆：责任链模式、策略模式、状态模式
 *
 * Created by VictorLiu on 2018/10/18.
 */
package cn.lw.pattern.j.strategy;