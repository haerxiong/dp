package cn.lw.pattern.e.resposibility.demo;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class HelloFilter implements Filter {

    @Override
    public void process() {
        System.out.println("hello");
    }
}
