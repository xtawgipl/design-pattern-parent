package desing.pattern.structural.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Disk子系统类
 *
 * @author zhangjj
 * @create 2018-03-21 13:50
 **/
public class Disk {

    private Logger logger = LoggerFactory.getLogger(Disk.class);

    public void start(){
        logger.info("disk is start...");
    }
}
