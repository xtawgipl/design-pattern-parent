package desing.pattern.structural.flyweight.pure;

import desing.pattern.structural.flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂(FlyweightFactory)角色:
 * 在享元模式中，有一个至关重要的模块就是工厂模块了。在 Flyweight Factory
 * 里维护了一个 Flyweight 池(存放内部状态)，Flyweight Factory 就是通过这个
 * Flyweight 池对整个享元模式进行控制
 *
 * FlyweightFactory 实际上是起到了一个过滤筛选的功能，过滤重复的对象，缓存新对象。
 *
 * @author zhangjj
 * @create 2018-03-23 14:29
 **/
public class FlyweightFactory {

    private static Map<Integer, Flyweight> labels = new HashMap<>();

    public static Flyweight factory(String intrinsicState) {
        int hashCode = intrinsicState.hashCode();
        Flyweight fly = labels.get(hashCode);
        if (fly == null) {
            fly = new ConcreteFlyweight(intrinsicState);
            labels.put(hashCode, fly);
        }
        return fly;
    }
}
