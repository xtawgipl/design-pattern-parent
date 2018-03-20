package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * USB接口实现类
 *
 * @author zhangjj
 * @create 2018-03-20 14:48
 **/
public class Usber implements Usb{

    private Logger logger = LoggerFactory.getLogger(Usber.class);

    @Override
    public void isUsb() {
        logger.info("USB接口");
    }
}
