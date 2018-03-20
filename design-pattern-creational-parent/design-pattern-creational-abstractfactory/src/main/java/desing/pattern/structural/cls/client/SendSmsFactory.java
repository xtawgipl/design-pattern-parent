package desing.pattern.structural.cls.client;

import desing.pattern.structural.cls.buss.Sender;
import desing.pattern.structural.cls.buss.SmsSender;

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
