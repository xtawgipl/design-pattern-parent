import desing.pattern.structural.cglib.CGLibProxy;
import desing.pattern.structural.cglib.Train;
import desing.pattern.structural.jdk.Car;
import desing.pattern.structural.jdk.Moveable;
import desing.pattern.structural.jdk.TimeHandler;
import desing.pattern.structural.statics.Admin;
import desing.pattern.structural.statics.Manager;
import desing.pattern.structural.statics.AdminPoly;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试类
 *
 * @author zhangjj
 * @create 2018-03-21 9:31
 **/
public class ProxyTest {

    /**
     *
     * 静态代码 测试
     * @param
     * @author zhangjj
     * @Date 2018/3/21 9:33
     * @return
     * @exception
     *
     */
    @Test
    public void staticsTeest(){
        Manager manager = new AdminPoly(new Admin());
        manager.doSomething();
    }


    /**
     *
     * jdk自带Proxy类实现动态代码 测试
     * 相对静态代理，不需要为每个target写一个代理类
     * @param
     * @author zhangjj
     * @Date 2018/3/21 10:03
     * @return
     * @exception
     *
     */
    @Test
    public void dynamicJdkProxyTest() throws Exception {
        Car car = new Car();
        Class<? extends Car> aClass = car.getClass();
        InvocationHandler h = new TimeHandler(car);
        Moveable moveable = (Moveable) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), h);
        moveable.move();
    }

    /**
     * 使用cglib实现动态代理，相对jdk 自带动态代理是不要求target实现接口。
     * cglib字节码技术生成target的子类来构造动态代理
     * @param
     * @author zhangjj
     * @Date 2018/3/21 10:57
     * @return
     * @exception
     *
     */
    @Test
    public void dynamicCglibTest(){
        CGLibProxy proxy = new CGLibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();

    }
}
