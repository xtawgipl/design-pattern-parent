package desing.pattern.structural.jdk;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * 事务处理器
 *
 * @author zhangjj
 * @create 2018-03-21 9:46
 **/
public class TimeHandler implements InvocationHandler {

    private Logger logger = LoggerFactory.getLogger(TimeHandler.class);

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Stopwatch watch = Stopwatch.createStarted();
        logger.info("汽车开始行驶…");
        Object invoke = method.invoke(target, args);
        watch.stop();
        long elapsed = watch.elapsed(TimeUnit.MILLISECONDS);
        logger.info("汽车结束行驶…汽车行驶时间：" + elapsed + " 毫秒！");
        return invoke;
    }

}
