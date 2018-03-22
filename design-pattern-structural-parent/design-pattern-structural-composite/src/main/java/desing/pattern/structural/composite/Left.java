package desing.pattern.structural.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 表示叶节点对象。叶子节点没有子节点。
 *
 * @author zhangjj
 * @create 2018-03-22 11:11
 **/
public class Left extends Component{

    private Logger logger = LoggerFactory.getLogger(Left.class);


    public Left(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        logger.info("Can not add to a leaf");
    }

    @Override
    public void remove(Component component) {
        logger.info("Can not remove from a leaf");
    }

    @Override
    public void display(int depth) {
        String temp = "";
        for(int i = 0; i < depth; ++i){
            temp += "- ";
        }

        System.out.println(temp + name);
    }
}
