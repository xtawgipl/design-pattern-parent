package desing.pattern.structural.flyweight.composite;

import desing.pattern.structural.flyweight.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 享元工厂(FlyweightFactory)角色:
 *     本角 色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。当一个客户端
 *     对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有 一个符合要求的享元对象。
 *     如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对
 *     象的话，享元工厂角色就应当创建一个 合适的享元对象。
 * @author zhangjj
 * @create 2018-03-26 9:50
 **/
public class CompositeFlyweightFactory {

    private static Map<Integer, Flyweight> lables = new HashMap<>();

    /**
     * 纯享元工厂
     *
     * @param
     * @author zhangjj
     * @Date 2018/3/26 10:01
     * @return
     * @exception
     *
     */
    public static Flyweight factory(String intrinsicState){
        int hashCode = intrinsicState.hashCode();
        Flyweight flyweight = lables.get(hashCode);
        if(flyweight == null){
            flyweight = new ConcreteCompositeFlyweight();
            lables.put(hashCode, flyweight);
        }
        return flyweight;
    }

    public static Flyweight factory(List<String> intrinsicStates){
        ConcreteCompositeFlyweight flyweight = new ConcreteCompositeFlyweight();
        for(String intrinsicState : intrinsicStates){
            flyweight.add(intrinsicState.hashCode(), factory(intrinsicState));
        }
        return flyweight;
    }

}

























