package cn.lw.pattern.d.factory;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductBody;
import cn.lw.pattern.d.factory.complex.AbstractFactory;
import cn.lw.pattern.d.factory.complex.FactoryProducer;
import cn.lw.pattern.d.factory.method.XmlFactory;
import cn.lw.pattern.d.factory.method.StringXmlFactory;
import cn.lw.pattern.d.factory.method.FileXmlFactory;
import cn.lw.pattern.d.factory.simple.SimpleAFactory;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class FactoryDemo {

    public static void main(String[] args) {
        // 简单工厂
        SimpleAFactory simpleAFactory = new SimpleAFactory();
        ProductHead simpleProductA = simpleAFactory.create("1");

        // 工厂方法
        XmlFactory methodFactory = null; // 抽象方法，具体实现延迟到子类
        String name1;
        String name2;
        {// 括号内为子类实现，可以方便的新增逻辑，而不更改父类逻辑。

            // 数字逻辑
            methodFactory = new FileXmlFactory();
            name1 = "1";
            name2 = "2";

            // 字母逻辑
            methodFactory = new StringXmlFactory();
            name1 = "a";
            name2 = "b";
        }
        ProductHead nf1 = methodFactory.create(name1);
        ProductHead nf2 = methodFactory.create(name2);

        // 抽象工厂
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory jsonFactory = producer.getFactory(true);
        jsonFactory.head("");
        jsonFactory.body("");
    }
}
