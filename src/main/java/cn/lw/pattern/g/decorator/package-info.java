/**
 * 装饰模式

     与静态代理非常相似。

     使用代理模式的时，我们常常在一个代理类中保存一个对象的实例。
     使用装饰模式的时，我们通常将原始对象作为一个参数传给装饰者的构造器。

     装饰模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。

     e.g.
        new DataOutputStream(new FileOutputStream(fileName))

 * Created by VictorLiu on 2018/10/12.
 */
package cn.lw.pattern.g.decorator;