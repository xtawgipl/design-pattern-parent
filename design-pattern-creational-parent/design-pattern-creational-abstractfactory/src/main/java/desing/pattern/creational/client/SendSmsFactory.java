package desing.pattern.creational.client;

import desing.pattern.creational.buss.Sender;
import desing.pattern.creational.buss.SmsSender;

/**
 * 短信 工厂  类
 *
 * @author zhangjj
 * @create 2018-03-19 14:18
 **/
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
