package desing.pattern.structural;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PNG格式图像：RefinedAbstraction（扩充抽象类）角色
 *
 * @author zhangjj
 * @create 2018-03-21 16:20
 **/
public class PNGImage extends Image {

    private Logger logger = LoggerFactory.getLogger(PNGImage.class);

    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        logger.info(fileName + "，格式为PNG。");
    }

}
