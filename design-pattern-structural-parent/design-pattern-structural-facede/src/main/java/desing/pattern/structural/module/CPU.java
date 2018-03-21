package desing.pattern.structural.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * cpu子系统类
 *
 * @author zhangjj
 * @create 2018-03-21 13:49
 **/
public class CPU {

    private Logger logger = LoggerFactory.getLogger(CPU.class);

    public void start(){
        logger.info("cpu is start...");
    }

}
