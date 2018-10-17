package cn.lw.pattern.h.prototype.demo;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class ObjCache implements Cloneable {

    public int a;

    public String b;

    public T t;

    @Override
    public ObjCache clone() {
        try {
            ObjCache clone = (ObjCache) super.clone();
            clone.t = (T) this.t.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
