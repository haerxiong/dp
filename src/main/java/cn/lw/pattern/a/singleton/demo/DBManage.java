package cn.lw.pattern.a.singleton.demo;

/**
 * Created by VictorLiu on 2018/10/12.
 */
public class DBManage {

    private static DBManage manage;

    private DBManage() {
    }

    public static DBManage getInstance() {
        if(manage == null)
            manage = new DBManage();
        return manage;
    }
}
