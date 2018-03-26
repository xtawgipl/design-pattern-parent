package desing.pattern.structural.flyweight.pure;

import desing.pattern.structural.flyweight.Flyweight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单纯享元模式：
 * 对于享元部分，ConcreteFlyweight 必须是可共享的，它保存的任何状态都必须是内部(intrinsic)，
 * ConcreteFlyweight 必须和它的应用环境场合无关。比如字符串 “Hello” 就无需关心使用它的场合，
 * 它是一个不可变的对象
 *
 * @author zhangjj
 * @create 2018-03-23 14:25
 **/
public class ConcreteFlyweight implements Flyweight {

    private Logger logger = LoggerFactory.getLogger(ConcreteFlyweight.class);

    private String intrinsicState = null;

    public ConcreteFlyweight(String _intrinsicState) {
        this.intrinsicState = _intrinsicState;
    }


    /**
     *
     * 外蕴状态作为参数传入方法中 改变方法的行为 但是并不改变对象的内蕴状态
     * @param
     * @author zhangjj
     * @Date 2018/3/23 14:27
     * @return
     * @exception
     *
     */
    @Override
    public void operation(String extrinsicState) {
        logger.info("内蕴状态：" + intrinsicState);
        logger.info("外蕴状态：" + extrinsicState);
    }
}
