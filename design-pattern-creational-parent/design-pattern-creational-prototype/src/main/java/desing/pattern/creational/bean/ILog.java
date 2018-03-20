package desing.pattern.creational.bean;

/**
 * 日报接口，充当Prototype角色
 *
 * @author zhangjj
 * @create 2018-03-20 10:54
 **/
public interface ILog {

    /**
     * 克隆自身的方法
     * @param
     * @author zhangjj
     * @Date 2018/3/20 10:55
     * @return
     * @exception
     *
     */
    ILog clone();

    /**
     * 其他的 业务方法
     * @param
     * @author zhangjj
     * @Date 2018/3/20 10:56
     * @return
     * @exception
     *
     */
    void display();
}
