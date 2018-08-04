package desing.pattern.structural.mybatis.mapper;


import desing.pattern.structural.mybatis.Connection;
import desing.pattern.structural.mybatis.TestConnection;
import desing.pattern.structural.mybatis.logging.ConnectionLogger;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * @author zhangjj
 * @create 2018-08-03 16:02
 **/
@Slf4j
public class ExcutorHandler {

    public Connection getConnection(){
        TestConnection connection = new TestConnection();
        if(log.isDebugEnabled()){
            return (Connection) Proxy.newProxyInstance(connection.getClass().getClassLoader(), connection.getClass().getInterfaces(), new ConnectionLogger(connection));
        }else{
            return connection;
        }
    }
}
