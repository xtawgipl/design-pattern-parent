package desing.pattern.structural.cls.client;

import desing.pattern.structural.cls.bean.ProductBean;

/**
 * 抽象建造
 *
 * @author zhangjj
 * @create 2018-03-19 17:08
 **/
public interface Builder {
    /**
     * 打基础
     */
    Builder buildBasic();

    /**
     * 砌墙
     */
    Builder buildWalls();

    /**
     * 封顶
     */
    Builder roofed();

    /**
     * 造房子
     * @return
     */
    ProductBean buildProduct();
}
