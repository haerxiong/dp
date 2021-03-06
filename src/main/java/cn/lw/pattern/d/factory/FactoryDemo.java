package cn.lw.pattern.d.factory;

import cn.lw.pattern.d.factory.common.ProductHead;
import cn.lw.pattern.d.factory.common.ProductBody;
import cn.lw.pattern.d.factory.abs.AbstractFactory;
import cn.lw.pattern.d.factory.abs.FactoryProducer;
import cn.lw.pattern.d.factory.method.HeadFactory;
import cn.lw.pattern.d.factory.method.CharFactory;
import cn.lw.pattern.d.factory.method.NumberFactory;
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
        HeadFactory methodFactory = null; // 抽象方法，具体实现延迟到子类
        String name1;
        String name2;
        {// 括号内为子类实现，可以方便的新增逻辑，而不更改父类逻辑。

            // 数字逻辑
            methodFactory = new NumberFactory();
            name1 = "1";
            name2 = "2";

            // 字母逻辑
            methodFactory = new CharFactory();
            name1 = "a";
            name2 = "b";
        }
        ProductHead productHead = methodFactory.create(name1);

        // 抽象工厂
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory jsonFactory = producer.getFactory(true);
        ProductHead head = jsonFactory.head("");
        ProductBody body = jsonFactory.body("");
    }
}
