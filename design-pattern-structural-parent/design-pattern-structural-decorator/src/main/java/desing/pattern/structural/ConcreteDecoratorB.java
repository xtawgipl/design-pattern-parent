package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体装饰角色B
 *
 * @author zhangjj
 * @create 2018-03-20 16:47
 **/
public class ConcreteDecoratorB extends Decorator{

    private Logger logger = LoggerFactory.getLogger(ConcreteDecoratorB.class);

    //首先运行原Component的operation()，再执行本类的功能，相当于对原Component进行了装饰
    @Override
    public void operation() {
        super.operation();

        AddedBehavior();
        logger.info("具体装饰对象B的操作");
    }

    //本类的独有功能
    private void AddedBehavior() {
        logger.info("我是具体装饰对象B的独有方法");
    }
}
