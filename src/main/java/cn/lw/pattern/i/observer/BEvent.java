package cn.lw.pattern.i.observer;

import org.springframework.context.ApplicationEvent;

/**
 * Created by VictorLiu on 2018/10/18.
 */
public class BEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public BEvent(Object source) {
        super(source);
    }
}
