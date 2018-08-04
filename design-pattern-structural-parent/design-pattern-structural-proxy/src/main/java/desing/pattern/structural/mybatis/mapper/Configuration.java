package desing.pattern.structural.mybatis.mapper;

/**
 * @author zhangjj
 * @create 2018-08-03 13:49
 **/
public class Configuration {

    public Configuration(){

    }

    public <T> T getMapper(Class<T> clazz){
        MapperProxyFactory<T> proxyFactory = new MapperProxyFactory<>();
        return proxyFactory.newInstance(clazz);
    }

}
