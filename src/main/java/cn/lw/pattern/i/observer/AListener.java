package cn.lw.pattern.i.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by VictorLiu on 2018/10/18.
 */
public class AListener implements ApplicationListener<AEvent> {

    @Override
    public void onApplicationEvent(AEvent event) {
        System.out.println("get an Aevent");
    }
}
