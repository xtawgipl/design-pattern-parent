package desing.pattern.structural;

/**
 * 抽象图像类：Abstraction（抽象类） 角色
 *
 * @author zhangjj
 * @create 2018-03-21 16:14
 **/
public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
