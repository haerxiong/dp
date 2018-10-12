package cn.lw.pattern.a.singleton;

import cn.lw.pattern.a.singleton.demo.DBManage;

/**
 * 单例模式的实现手段有多种
 * 此例使用static变量保存了实例
 * Created by VictorLiu on 2018/10/12.
 */
public class SingletonDemo {

    public static void main(String[] args) {
        DBManage dbManage = DBManage.getInstance();
    }
}
