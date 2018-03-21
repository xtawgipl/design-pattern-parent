package desing.pattern.structural.cglib;

import com.google.common.base.Stopwatch;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * 生成代理
 *
 * @author zhangjj
 * @create 2018-03-21 10:47
 **/
public class CGLibProxy implements MethodInterceptor {

    private Logger logger = LoggerFactory.getLogger(CGLibProxy.class);

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Stopwatch watch = Stopwatch.createStarted();
        logger.info("火车行驶开始");
        Object invoke = proxy.invokeSuper(obj, args);
        logger.info("火车行驶结束");
        watch.stop();
        long elapsed = watch.elapsed(TimeUnit.MILLISECONDS);
        logger.info("火车结束行驶…火车行驶时间：" + elapsed + " 毫秒！");
        return invoke;
    }
}
