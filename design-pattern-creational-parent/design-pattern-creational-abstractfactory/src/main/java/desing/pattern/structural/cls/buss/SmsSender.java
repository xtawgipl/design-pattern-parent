package desing.pattern.structural.cls.buss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟 短信发送类
 *
 * @author zhangjj
 * @create 2018-03-19 13:49
 **/
public class SmsSender implements Sender {

    private Logger logger = LoggerFactory.getLogger(SmsSender.class);

    @Override
    public void send() {
        logger.info("send sms");
    }
}
