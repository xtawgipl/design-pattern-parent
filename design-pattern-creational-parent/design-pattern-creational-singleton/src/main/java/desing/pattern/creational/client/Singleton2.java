package desing.pattern.creational.client;

import java.io.Serializable;

/**
 * 拆分法————懒汉式 实现单例
 *
 * getInstance() 与 syncInit() 方法拆分开可以防止jvm指令重排问题
 *
 * 指令重排问题：
 *     在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();
 *     语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，
 *     然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错了
 *
 * 以A、B两个线程为例：
 * a>A、B线程同时进入了第一个if判断
 * b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
 * c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，
 *   并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
 * d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
 * e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
 *
 * @author zhangjj
 * @create 2018-03-19 15:55
 **/
public class Singleton2 implements Serializable{

    private static Singleton2 instance = null;

    private Singleton2() {

    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton2();
        }
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
