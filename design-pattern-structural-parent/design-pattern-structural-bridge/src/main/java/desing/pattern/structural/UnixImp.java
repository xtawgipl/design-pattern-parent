package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unix操作系统实现类：ConcreteImplementor（具体实现类） 角色
 *
 * @author zhangjj
 * @create 2018-03-21 16:18
 **/
public class UnixImp implements ImageImp {

    private Logger logger = LoggerFactory.getLogger(UnixImp.class);

    @Override
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        logger.info("在Unix操作系统中显示图像：");
    }

}
