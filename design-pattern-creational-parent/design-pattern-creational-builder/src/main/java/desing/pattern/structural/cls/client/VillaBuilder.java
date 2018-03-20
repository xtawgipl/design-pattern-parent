package desing.pattern.structural.cls.client;

import desing.pattern.structural.cls.bean.ProductBean;

/**
 * 具体的建造
 * "别墅" 的构造器
 * @author zhangjj
 * @create 2018-03-19 17:09
 **/
public class VillaBuilder implements Builder {

    private ProductBean product;

    public VillaBuilder(){
        product = new ProductBean();
    }


    @Override
    public Builder buildBasic() {
        product.setBasic("打好基础");
        return this;
    }

    @Override
    public Builder buildWalls() {
        product.setWall("砌墙");
        return this;
    }

    @Override
    public Builder roofed() {
        product.setRoofed("封顶大吉");
        return this;
    }

    @Override
    public ProductBean buildProduct() {
        return product;
    }
}
