package desing.pattern.structural.cls.buss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟 邮件发送类
 *
 * @author zhangjj
 * @create 2018-03-19 13:43
 **/
public class MailSender implements Sender {

    private Logger logger = LoggerFactory.getLogger(MailSender.class);

    @Override
    public void send() {
        logger.info("send mail");
    }
}
