package cn.lw.pattern.h.prototype.demo;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class T implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int msg = 0;

}

