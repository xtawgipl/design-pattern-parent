package desing.pattern.structural.obj;

import desing.pattern.structural.Ps2;
import desing.pattern.structural.Usb;

/**
 * 对象  适配器模式 实现
 * 基于组合实现
 *
 * @author zhangjj
 * @create 2018-03-20 15:03
 **/
public class ObjAdapter implements Ps2{

    private Usb usb;

    public ObjAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }

}
