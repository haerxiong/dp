/**
 * 代理模式
 *
 *  定义：给某一个对象提供一个代理对象，并由代理控制原对象的引用。
 *
     三种代理：
         静态代理
            实现相同的接口。
         动态代理
            不需要实现相同接口，但代理目标必须实现一个接口。Proxy.newProxyInstance(p1,p2,p3)

        cglib动态代理|子类代理（需要net.sf.... cglib.jar）
            运行期扩展，在内存中生成子类的方式进行代理。
            代理目标必须有空的构造函数，且不能为final class

     e.g.
         SpringWebSocket中WebsocketHandlerDecorator
         Spring AOP

    备注:
        代理模式与装饰模式十分相似，但更注重对代理者的控制，而非装饰模式的修饰作用。

 * Created by VictorLiu on 2018/10/12.
 */
package cn.lw.pattern.f.proxy;