package cn.lw.pattern.j.strategy;

import org.springframework.web.method.annotation.RequestHeaderMethodArgumentResolver;
import org.springframework.web.method.annotation.RequestParamMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;

import java.util.List;

/**
 * Created by VictorLiu on 2018/10/18.
 */
public class StrategyDemo {

    public static void main(String[] args) {
        HandlerMethodArgumentResolverComposite hm = new HandlerMethodArgumentResolverComposite();
        HandlerMethodArgumentResolver a = new RequestParamMethodArgumentResolver(true);
        HandlerMethodArgumentResolver b = new RequestHeaderMethodArgumentResolver(null);
        hm.addResolvers(a, b);
    }
}
