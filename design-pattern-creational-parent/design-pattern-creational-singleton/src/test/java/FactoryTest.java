import desing.pattern.structural.cls.client.Singleton;
import desing.pattern.structural.cls.client.Singleton2;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 测试
 *
 * @author zhangjj
 * @create 2018-03-19 14:07
 **/
public class FactoryTest {

    /**
     *  多次getInstance获取同一对象
     * @param
     * @author zhangjj
     * @Date 2018/3/19 16:34
     * @return
     * @exception
     *
     */
    @Test
    public void singletonTesst() {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assert.assertEquals(instance, instance2);


    }

    /**
     * 加了readResolve 方法的对象 ，可以防止反序列化
     * @param
     * @author zhangjj
     * @Date 2018/3/19 16:34
     * @return
     * @exception
     *
     */
    @Test
    public void singletonTesst2() throws Exception {
        Singleton instance = Singleton.getInstance();
        FileOutputStream fos = new FileOutputStream("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton instance2 = (Singleton) ois.readObject();

        Assert.assertEquals(instance, instance2);
    }

    /**
     * 未readResolve 方法的对象，通过序列化可以创建多个对象
     * @param
     * @author zhangjj
     * @Date 2018/3/19 16:35
     * @return 
     * @exception 
     * 
     */
    @Test
    public void singletonTesst3() throws Exception {
        Singleton2 instance = Singleton2.getInstance();
        FileOutputStream fos = new FileOutputStream("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Singleton2 instance2 = (Singleton2) ois.readObject();

        Assert.assertEquals(instance, instance2);
    }


    /**
     * 防止反射多次创建实例
     * @param
     * @author zhangjj
     * @Date 2018/3/19 16:38
     * @return
     * @exception
     *
     */
    @Test
    public void singletonTesst4() throws Exception {
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton singleton = declaredConstructor.newInstance(null);
        Singleton singleton2 = declaredConstructor.newInstance(null);
        Assert.assertEquals(singleton, singleton2);
    }

    /**
     * 未加防反射功能 ，可以通过反射创建出多个实例
     * @param
     * @author zhangjj
     * @Date 2018/3/19 16:43
     * @return
     * @exception
     *
     */
    @Test
    public void singletonTesst5() throws Exception {
        Constructor<Singleton2> declaredConstructor = Singleton2.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton2 singleton = declaredConstructor.newInstance(null);
        Singleton2 singleton2 = declaredConstructor.newInstance(null);
        Assert.assertEquals(singleton, singleton2);
    }


}
