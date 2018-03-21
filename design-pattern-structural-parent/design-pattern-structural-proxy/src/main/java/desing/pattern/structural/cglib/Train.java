package desing.pattern.structural.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体主题
 *
 * @author zhangjj
 * @create 2018-03-21 10:46
 **/
public class Train {

    private Logger logger = LoggerFactory.getLogger(Train.class);

    public void move(){
        logger.info("火车行驶中…");
    }

}
