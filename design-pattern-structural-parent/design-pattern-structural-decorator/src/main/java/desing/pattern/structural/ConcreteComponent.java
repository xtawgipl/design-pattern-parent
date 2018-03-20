package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体构件角色
 *
 * @author zhangjj
 * @create 2018-03-20 16:35
 **/
public class ConcreteComponent extends Component{

    private Logger logger = LoggerFactory.getLogger(ConcreteComponent.class);

    @Override
    public void operation() {
        logger.info("具体对象的操作");
    }
}
