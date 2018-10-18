package cn.lw.pattern.i.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by VictorLiu on 2018/10/18.
 */
public class AllListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("All : get a event");
    }
}
