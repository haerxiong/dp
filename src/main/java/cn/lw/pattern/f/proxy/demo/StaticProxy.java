package cn.lw.pattern.f.proxy.demo;

/**
 * Created by VictorLiu on 2018/10/12.
 */
public class StaticProxy implements ICRUD {

    private ADao dao;

    public StaticProxy(ADao dao) {
        this.dao = dao;
    }

    @Override
    public int update() {
        System.out.println("静态代理 before call 获取连接");
        int rs = dao.update();
        System.out.println("静态代理 after call 关闭连接");
        return rs;
    }

}
