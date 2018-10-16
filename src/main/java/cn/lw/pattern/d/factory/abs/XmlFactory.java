package cn.lw.pattern.d.factory.abs;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductBody;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class XmlFactory implements AbstractFactory {
    @Override
    public ProductHead head(String name) {
        return null;
    }

    @Override
    public ProductBody body(String key) {
        return null;
    }
}
