package desing.pattern.structural.cls;

import desing.pattern.structural.Ps2;
import desing.pattern.structural.Usber;

/**
 * 类 适配器
 * 基于类继承实现
 *
 * @author zhangjj
 * @create 2018-03-20 14:49
 **/
public class ClsAdapter extends Usber implements Ps2 {

    /**
     * client 在调用 isPs2 接口的时候实现调用的是 Usber的方法
     *
     * @param
     * @author zhangjj
     * @Date 2018/3/20 14:50
     * @return 
     * @exception 
     * 
     */
    @Override
    public void isPs2() {
        isUsb();
    }
}
