package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Windows操作系统实现类：ConcreteImplementor（具体实现类） 角色
 *
 * @author zhangjj
 * @create 2018-03-21 16:16
 **/
public class WindowsImp implements ImageImp {

    private Logger logger = LoggerFactory.getLogger(WindowsImp.class);

    @Override
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        logger.info("在Windows操作系统中显示图像：");
    }
}
