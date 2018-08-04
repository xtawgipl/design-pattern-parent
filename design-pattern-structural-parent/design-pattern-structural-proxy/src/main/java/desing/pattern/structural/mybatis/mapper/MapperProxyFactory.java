package desing.pattern.structural.mybatis.mapper;

import java.lang.reflect.Proxy;

/**
 * 代理工厂
 *
 * @author zhangjj
 * @create 2018-08-03 11:16
 **/
public class MapperProxyFactory<T> {

    public T newInstance(Class<T> clazz){

        return (T)Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, new MapperProxy<T>());
    }
}
