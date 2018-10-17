package cn.lw.pattern.c.builder;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class BuilderDemo {

    public static void main(String[] args) {
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition()
                .setAbstract(true).setAbstract(true).getBeanDefinition();
        RootBeanDefinition rbd;
        GenericBeanDefinition gbd;
    }
}
