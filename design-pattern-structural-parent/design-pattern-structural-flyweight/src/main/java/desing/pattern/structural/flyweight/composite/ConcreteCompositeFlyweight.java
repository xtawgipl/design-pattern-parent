package desing.pattern.structural.flyweight.composite;

import desing.pattern.structural.flyweight.Flyweight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元模式：
 * 复合式享元相当于多个单纯享元的集合。也就是说复合享元相当于对单纯享元进行了一个再分组，
 * 在复合享元的每个分组里又是一个独立的单纯享元模式
 *
 *     复合享元(ConcreteCompositeFlyweight)角色:
 *         复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解
 *         成为多个本身是单纯享元对象的组合。复合享元角色又称作不可共享的享元对象
 *
 * @author zhangjj
 * @create 2018-03-26 9:36
 **/
public class ConcreteCompositeFlyweight implements Flyweight {

    private Logger logger = LoggerFactory.getLogger(ConcreteCompositeFlyweight.class);

    private Map<Integer, Flyweight> lables = new HashMap<>();

    public void add(int key, Flyweight flyweight){
        lables.put(key, flyweight);
    }

    @Override
    public void operation(String extrinsicState) {
        logger.info("ConcreteCompositeFlyweight ---> {}", extrinsicState);
        Flyweight flyweight;
        for(Integer key : lables.keySet()){
            flyweight = lables.get(key);
            flyweight.operation(extrinsicState);
        }
    }
}
