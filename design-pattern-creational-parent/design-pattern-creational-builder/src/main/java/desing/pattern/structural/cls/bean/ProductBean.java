package desing.pattern.structural.cls.bean;

/**
 * 要创建的业务对象
 *
 * 以建房子这一个工程为例子。
 * 这一过程为打桩建立基础、砌墙、封顶。不管是普通房子也好，别墅也好都需要经历这一过程
 *
 * @author zhangjj
 * @create 2018-03-19 17:06
 **/
public class ProductBean {

    private String basic;//地基

    private String wall;//墙

    private String roofed;//楼顶

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
