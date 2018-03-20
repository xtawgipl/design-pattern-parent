package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体装饰角色A
 *
 * @author zhangjj
 * @create 2018-03-20 16:45
 **/
public class ConcreteDecoratorA extends Decorator{

    private Logger logger = LoggerFactory.getLogger(ConcreteDecoratorA.class);

    //本类的独有功能
    private String addedState;
    //首先运行原Component的operation()，再执行本类的功能，相当于对原Component进行了装饰


    @Override
    public void operation() {
        super.operation();

        addedState = "New State";
        logger.info("具体装饰对象A的操作。" + addedState);
    }
}
