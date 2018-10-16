package cn.lw.pattern.g.decorator;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/**
 * Created by VictorLiu on 2018/10/16.
 */
public class DecoratorDemo {

    public static void main(String[] args) throws FileNotFoundException {
        OutputStream os = null;
        DataOutputStream dos = new DataOutputStream(os);
    }
}
