package cn.lw.pattern.b.template.demo;

import java.util.List;

/**
 * Created by VictorLiu on 2018/10/12.
 */
public class AbstractParser implements NewsParser {

    public List parser(String url) {
        // 根据url获取连接等相关处理

        // 根据不同url不同情况让子类去实现内容的解析
        parserDetail();
        parserTitle();

        // 后续存储处理
        List list = null;
        return list;
    }

    @Override
    public String parserTitle() {
        return null;
    }

    @Override
    public String parserDetail() {
        return null;
    }
}
