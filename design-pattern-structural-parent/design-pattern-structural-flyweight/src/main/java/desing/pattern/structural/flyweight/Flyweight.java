package desing.pattern.structural.flyweight;

/**
 * 抽象享元(Flyweight)角色:
 * 在单纯的享元模式中，需要给出一个抽象接口，以规定出所有具体享元角色需要实现的方法
 *
 * @author zhangjj
 * @create 2018-03-23 14:23
 **/
public interface Flyweight {

    void operation(String state);


}
