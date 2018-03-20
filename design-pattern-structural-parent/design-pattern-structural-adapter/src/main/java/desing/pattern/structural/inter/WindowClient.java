package desing.pattern.structural.inter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * client端
 *
 * WindowClient 窗口类需要具备 MouserListener 部分功能 ，则只需要继承适配器MouseAdapter重写具体方法即可
 *
 * @author zhangjj
 * @create 2018-03-20 15:17
 **/
public class WindowClient extends MouseAdapter {

    private Logger logger = LoggerFactory.getLogger(WindowClient.class);

    @Override
    public void dbClient() {
        logger.info("double client...");
    }
}
