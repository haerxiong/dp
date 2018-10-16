package cn.lw.pattern.d.factory.complex;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductBody;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public interface AbstractFactory {

    public ProductHead head(String name);

    public ProductBody body(String key);
}
