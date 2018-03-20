package desing.pattern.creational.factory;

import desing.pattern.creational.bean.ProductBean;

/**
 * 具体的建造
 * "大厦" 的构造器
 * @author zhangjj
 * @create 2018-03-19 17:40
 **/
public class MansionBuilder implements Builder{

    private ProductBean product;

    public MansionBuilder(){
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
