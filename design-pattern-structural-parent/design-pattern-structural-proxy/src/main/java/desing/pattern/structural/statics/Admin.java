package desing.pattern.structural.statics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 真实主题类
 *
 * @author zhangjj
 * @create 2018-03-21 9:26
 **/
public class Admin implements Manager {

    private Logger logger = LoggerFactory.getLogger(Admin.class);

    @Override
    public void doSomething() {
        logger.info("Admin do something.");
    }
}
