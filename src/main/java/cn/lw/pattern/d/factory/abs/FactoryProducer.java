package cn.lw.pattern.d.factory.abs;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class FactoryProducer {

    public AbstractFactory getFactory(boolean isJson) {
        if(isJson)
            return new JsonFactory();
        return new XmlFactory();
    }
}
