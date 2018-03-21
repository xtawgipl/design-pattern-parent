package desing.pattern.structural.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * 真实主题
 *
 * @author zhangjj
 * @create 2018-03-21 9:44
 **/
public class Car implements Moveable {

    private Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public void move() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        logger.info("汽车行驶中…");
    }
}
