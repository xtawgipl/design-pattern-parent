package desing.pattern.structural.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Memory子系统类
 *
 * @author zhangjj
 * @create 2018-03-21 13:51
 **/
public class Memory {

    private Logger logger = LoggerFactory.getLogger(Memory.class);

    public void start(){
        logger.info("memory is start...");
    }

}
