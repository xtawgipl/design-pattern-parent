package desing.pattern.structural.cls.client;

import java.io.Serializable;

/**
 * 单例工厂类
 *  内部类实现————饿汉式
 *
 * @author zhangjj
 * @create 2018-03-19 15:29
 **/
public class Singleton implements Serializable{

    /** 用来防止被反射多次创建实例 */
    private static boolean flag = false;

    /** 私有构造方法，防止被实例化 */
    private Singleton(){
        if(flag){//只执行一次创建实例
            throw new RuntimeException("单例模式正在被攻击");
        }else{
            flag = !flag;
        }
    }

    /** 此处使用一个内部类来维护单例 */
    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    /** 获取实例 */
    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * 这方法在对象反序列化时调用，并且把该方法的返回作为反序列化的结果
     * 如果在实现了Serializable接口的对象中不加该方法，可以序列化方法后再反序列化得到一个不一样的对象(这样JVM就存在了两个对象)
     * @return
     */
    public Object readResolve(){
        return getInstance();
    }
}
