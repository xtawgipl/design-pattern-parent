package desing.pattern.structural.cls.client;

import desing.pattern.structural.cls.buss.MailSender;
import desing.pattern.structural.cls.buss.Sender;

/**
 * 邮件 工厂 类
 *
 * @author zhangjj
 * @create 2018-03-19 14:17
 **/
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
