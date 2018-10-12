package cn.lw.pattern.b.template;

import cn.lw.pattern.b.template.demo.AbstractParser;
import cn.lw.pattern.b.template.demo.BaiduNewsParser;
import cn.lw.pattern.b.template.demo.NewsParser;
import cn.lw.pattern.b.template.demo.QQNewsParser;

/**
 * 本例实现一个新闻解析工具
 * 不同网站新闻格式不同，此差异可以推迟到子类中实现，部分功能又可以提前由Abstract的父类实现，达到重用的目的。
 * Created by VictorLiu on 2018/10/12.
 */
public class TemplateDemo {

    public static void main(String[] args) {
        AbstractParser parser1 = new QQNewsParser();
        AbstractParser parser2 = new BaiduNewsParser();
        AbstractParser[] parsers = new AbstractParser[]{parser1, parser2};

        for(AbstractParser p : parsers) {
            p.parser("............");
        }
    }
}
