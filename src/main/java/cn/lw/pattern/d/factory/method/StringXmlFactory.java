package cn.lw.pattern.d.factory.method;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductHeadFile;
import cn.lw.pattern.d.factory.common.ProductXmlString;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class StringXmlFactory implements XmlFactory {

    @Override
    public ProductHead create(String name) {
        if("a".equals(name))
            return new ProductHeadFile();
        else
            return new ProductXmlString();
    }
}
