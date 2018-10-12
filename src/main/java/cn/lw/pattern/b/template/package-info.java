/**
 * 模板模式

    定义：定义算法骨架，将一些步骤延迟到子类中。

     e.g.
     AbstractApplicationContext
     ---ClassPathXmlApplicationContext
     ---FileSystemXmlApplicationContext

     Spring加载配置文件：
         1、文件系统中的文件
         2、类路径中的文件
         3、Context

    备注：
        最常见的设计模式，几乎所有大型框架中都有使用，体现了OOP中继承的特点。

 * Created by VictorLiu on 2018/10/12.
 */
package cn.lw.pattern.b.template;