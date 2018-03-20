package desing.pattern.structural;

import desing.pattern.structural.Ps2;

/**
 * client端
 *
 * @author zhangjj
 * @create 2018-03-20 14:55
 **/
public class Client {

    private Ps2 ps;

    public Client(Ps2 ps) {
        this.ps = ps;
    }

    /**
     * 通过Adatpter构造出的ClsClient类，可以调用 request()方法而间接调用了适配target的方法
     * @param
     * @author zhangjj
     * @Date 2018/3/20 15:01
     * @return 
     * @exception 
     * 
     */
    public void request(){
        ps.isPs2();
    }
}
