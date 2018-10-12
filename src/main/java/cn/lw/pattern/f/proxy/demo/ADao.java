package cn.lw.pattern.f.proxy.demo;

/**
 * Created by VictorLiu on 2018/10/12.
 */
public class ADao implements ICRUD {

    private String tag;

    public ADao() {
    }

    public ADao(String tag) {
        this.tag = tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public int update() {
        System.out.println(String.format("%s:Adao.update", tag));
        return 0;
    }
}
