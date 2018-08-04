package desing.pattern.structural.mybatis.logging;

import desing.pattern.structural.mybatis.Connection;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * connection代理
 *
 * @author zhangjj
 * @create 2018-08-03 16:03
 **/
@Slf4j
public class ConnectionLogger implements InvocationHandler {


    private Connection connection;

    public ConnectionLogger(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log.debug("打开了 degub日志");

        return method.invoke(this.connection, args);
    }
}
