package cn.lw.pattern.d.factory.method;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductHeadJson;
import cn.lw.pattern.d.factory.common.ProductHeadXml;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class CharFactory implements HeadFactory {

    @Override
    public ProductHead create(String name) {
        if("a".equals(name))
            return new ProductHeadXml();
        else
            return new ProductHeadJson();
    }
}
