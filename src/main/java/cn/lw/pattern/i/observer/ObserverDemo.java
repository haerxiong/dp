package cn.lw.pattern.i.observer;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.*;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.support.GenericApplicationContext;

import java.util.EventListener;

/**
 * Created by VictorLiu on 2018/10/18.
 */
public class ObserverDemo {

    public static void main(String[] args) {
        ApplicationListener listener;
        ApplicationEvent event;
        ApplicationEventPublisher publisher;
        ApplicationEventMulticaster multicaster;

        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.addApplicationListener(new AListener());
        context.addApplicationListener(new AllListener());

        context.publishEvent(new BEvent(1));
        context.publishEvent(new AEvent(1));
    }
}
