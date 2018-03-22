import desing.pattern.structural.composite.Composite;
import desing.pattern.structural.composite.Left;
import org.junit.Test;

/**
 * 通过 Component 接口操作结构中的对象。
 *
 * 组合模式:
 *    将对象组合成树形结构以表示“部分-整体”的层次结构(可以表示树结构也可以表示链表结构等)。
 *    组合模式使得用户对单个对象和组合对象的使用具有唯一性。
 * 应用场景:
 *    1、想要表示对象的部分-整体层次结构。
 *    2、想要客户端忽略组合对象与单个对象的差异，客户端将统一地使用组合结构中的所有对象。
 *
 * @author zhangjj
 * @create 2018-03-22 11:19
 **/
public class Client {

    @Test
    public void clientTest(){
        Composite root = new Composite("root");
        root.add(new Left("left1"));
        root.add(new Left("left2"));

        Composite dir1 = new Composite("dir1");
        root.add(dir1);

        Composite dir2 = new Composite("dir2");
        dir2.add(new Left("left3"));
        root.add(dir2);

        Composite dir3 = new Composite("dir3");
        dir3.add(new Left("left4"));
        dir3.add(new Composite("dir4"));
        root.add(dir3);

        root.display(1);
    }
}
