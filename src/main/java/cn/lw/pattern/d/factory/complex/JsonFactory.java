package cn.lw.pattern.d.factory.complex;

import cn.lw.pattern.d.factory.common.ProductBodyJson;
import cn.lw.pattern.d.factory.common.ProductHeadJson;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class JsonFactory implements AbstractFactory {
    @Override
    public ProductHeadJson head(String name) {
        return null;
    }

    @Override
    public ProductBodyJson body(String key) {
        return null;
    }
}
