package cn.lw.pattern.e.resposibility;

import cn.lw.pattern.e.resposibility.demo.FilterChain;
import cn.lw.pattern.e.resposibility.demo.HelloFilter;
import cn.lw.pattern.e.resposibility.demo.HiFilter;
import cn.lw.pattern.e.resposibility.demo.OkFilter;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class ResponsibilityDemo {

    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HelloFilter());
        filterChain.addFilter(new OkFilter());
        filterChain.addFilter(new HiFilter());
        filterChain.process();
    }
}
