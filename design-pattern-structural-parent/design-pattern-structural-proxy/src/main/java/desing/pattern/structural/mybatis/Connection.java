package desing.pattern.structural.mybatis;

/**
 * @author zhangjj
 * @create 2018-08-03 16:12
 **/
public interface Connection {

    Object execute(String sql);
}
