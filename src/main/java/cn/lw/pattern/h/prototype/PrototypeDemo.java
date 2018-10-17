package cn.lw.pattern.h.prototype;

import cn.lw.pattern.h.prototype.demo.ObjCache;
import cn.lw.pattern.h.prototype.demo.T;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        ObjCache cache = new ObjCache();
        cache.a = 10;
        cache.t = new T();

        // 克隆后，成员也克隆过来了，
        ObjCache clone = cache.clone();
        System.out.println(clone.a);
        System.out.println(clone.equals(cache));

        clone.a = 1;
        clone.t.msg = 111;
        System.out.println(cache.a);
        System.out.println(clone.a);
        // 引用对象是无法复制的
        System.out.println(cache.t.msg);
        System.out.println(clone.t.msg);
    }
}
