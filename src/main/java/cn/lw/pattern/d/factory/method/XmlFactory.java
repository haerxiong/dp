package cn.lw.pattern.d.factory.method;

import cn.lw.pattern.d.factory.common.ProductHead;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public interface XmlFactory {

    public ProductHead create(String name);
}
