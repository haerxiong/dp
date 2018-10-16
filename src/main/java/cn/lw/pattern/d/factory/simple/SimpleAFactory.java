package cn.lw.pattern.d.factory.simple;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductHeadJson;
import cn.lw.pattern.d.factory.common.ProductHeadXml;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class SimpleAFactory {

    public ProductHead create(String name) {
        if("json".equals(name))
            return new ProductHeadJson();
        else
            return new ProductHeadXml();
    }
}
