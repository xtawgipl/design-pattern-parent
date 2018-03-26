import desing.pattern.structural.flyweight.Flyweight;
import desing.pattern.structural.flyweight.composite.CompositeFlyweightFactory;
import desing.pattern.structural.flyweight.pure.FlyweightFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Client测试类
 *
 * Flyweight在拳击比赛中指最轻量级，即“蝇量级”或“雨量级”，这里选择使用“享元模式”的意译，
 * 是因为这样更能反映模式的用意。享元模式是对象的结构模式。享元模式以共享的方式高效地支持大量的细粒度对象。
 * 也就是说在一个系统中如果有多个相同的对象，那么只共享一份就可以了，不必每个都去实例化一个对象。
 * Flyweight模式目的是减少相同对象的创建，提高性能 。同相的元素只创建一次
 * jdk中示例：
 *  1、String 使用的是享元模式，即new String("aaa") == new String("aaa") 的结果为true。一样的String在内存中只有一份
 *  2、Integer 在默认情况下(-128, 127]间的值是享元的（IntegerCache中static代码块一次性将(-128, 127]内的值放入Integer[]看）
 *     当new Integer()时，先从该数组中查找 ，如果存在则返回，如果不存在则构造后返回
 *     ————这就是Integer (-128, 127]内的值 == 成立(因为使用的是同一个值，所以地址相同)
 * @author zhangjj
 * @create 2018-03-23 14:31
 **/
public class FlyWeightClient {


    /**
     *
     * 单纯享元模式，对应flyWeight.png
     * @param
     * @author zhangjj
     * @Date 2018/3/23 14:32
     * @return 
     * @exception 
     * 
     */
    @Test
    public void flyWeightTest(){
        Flyweight test = FlyweightFactory.factory("test");
        Flyweight test2 = FlyweightFactory.factory("test");
        Assert.assertEquals(test, test2);
    }

    /**
     *
     * 复合享元模式测试，，对应flyWeight2.png
     * @param
     * @author zhangjj
     * @Date 2018/3/26 10:23
     * @return
     * @exception
     *
     */
    @Test
    public void compositeFlyWeightTest(){
        List<String> lables = new ArrayList<>();
        lables.add("aa");
        lables.add("bb");
        lables.add("cc");
        lables.add("dd");
        Flyweight factory = CompositeFlyweightFactory.factory(lables);
        factory.operation("test");
    }

}





















