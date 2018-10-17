/**
 * 建造者模式
 *
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 * 注：
 *  构建目标的属性过多，且具有固定联系，则将这些属性的设置封装在builder中。
 *
 * e.g.
 *  BeanDefinition为表示，BeanDefinitionBuilder为构建。
 *
 *
 * Created by VictorLiu on 2018/10/17.
 */
package cn.lw.pattern.c.builder;