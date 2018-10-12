package cn.lw.pattern.f.proxy;

import cn.lw.pattern.f.proxy.demo.ADao;
import cn.lw.pattern.f.proxy.demo.ICRUD;
import cn.lw.pattern.f.proxy.demo.StaticProxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by VictorLiu on 2018/10/12.
 */
public class ProxyDemo {

    public static void main(String[] args) {
        ADao adao = new ADao("lw");

        // 静态
        ICRUD staticDao = new StaticProxy(adao);
        System.out.println(staticDao.update());

        // 动态
        ICRUD dynamicDao = (ICRUD) Proxy.newProxyInstance(ProxyDemo.class.getClassLoader(), ADao.class.getInterfaces(), (Object proxy, Method method, Object[] args1) -> {
            System.out.println("动态代理 before");
            Integer invoke = (Integer) method.invoke(adao, args1);
            System.out.println("动态代理 after 返回值+1");
            return invoke + 1;
        });
        System.out.println(dynamicDao.update());

        // cglib
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ADao.class);
        enhancer.setCallback((MethodInterceptor) (Object o, Method method, Object[] objects, MethodProxy proxy) -> {
            System.out.println("cglib动态代理 before");
            Integer rs = (Integer) proxy.invokeSuper(o, objects);
            System.out.println("cglib动态代理 after 返回值+2");
            return rs+2;
        });
        ICRUD cglibProxy = (ICRUD) enhancer.create();
        System.out.println(cglibProxy.update());
    }
}
