import desing.pattern.structural.Image;
import desing.pattern.structural.ImageImp;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client测试类
 *
 * 桥接模式(Bridge Pattern)：
 *    将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，
 *    又称为柄体(Handle and Body)模式或接口(Interface)模式
 *
 * 桥接模式是一种很实用的结构型设计模式，如果软件系统中某个类存在两个独立变化的维度，
 *    通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职责原则”。
 *    与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层
 *    建立一个抽象关联，该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式。
 * 桥接模式用一种巧妙的方式处理多层继承存在的问题，用抽象关联取代了传统的多层继承，将类之间的
 * 静态继承关系转换为动态的对象组合关系，使得系统更加灵活，并易于扩展，同时有效控制了系统中类的个数
 *
 * 角色：
 *    Abstraction（抽象类）：用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个
 *        Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor之间具有关联关系，
 *        它既可以包含抽象业务方法，也可以包含具体业务方法
 *    RefinedAbstraction（扩充抽象类）：扩充由Abstraction定义的接口，通常情况下它不再是抽象类
 *        而是具体类，它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以
 *        调用在Implementor中定义的业务方法。
 *    Implementor（实现类接口）：定义实现类的接口，这个接口不一定要与Abstraction的接口完全一致，
 *        事实上这两个接口可以完全不同，一般而言，Implementor接口仅提供基本操作，而Abstraction定义的
 *        接口可能会做更多更复杂的操作。Implementor接口对这些基本操作进行了声明，而具体实现交给其子类。
 *        通过关联关系，在Abstraction中不仅拥有自己的方法，还可以调用到Implementor中定义的方法，
 *        使用关联关系来替代继承关系。
 *    ConcreteImplementor（具体实现类）：具体实现Implementor接口，在不同的ConcreteImplementor中
 *        提供基本操作的不同实现，在程序运行时，ConcreteImplementor对象将替换其父类对象，提供给抽象类
 *        具体的业务操作方法。
 * 适用场景：
 *    (1)如果一个系统需要在抽象化和具体化之间增加更多的灵活性，避免在两个层次之间建立静态的继承关系，
 *        通过桥接模式可以使它们在抽象层建立一个关联关系。
 *    (2)“抽象部分”和“实现部分”可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化
 *        子类的对象和一个实现化子类的对象进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合。
 *    (3)一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展。
 *    (4)对于那些不希望使用继承或因为多层继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 *
 *
 * @author zhangjj
 * @create 2018-03-21 16:28
 * @apiNote  https://www.cnblogs.com/lfxiao/p/6815760.html
 **/
public class BridgeTest {

    private Logger logger = LoggerFactory.getLogger(BridgeTest.class);

    public static final String ABSTRACTION_CLASSNAME = "desing.pattern.structural.BMPImage";

    public static final String IMPLEMENTOR_CLASSNAME = "desing.pattern.structural.LinuxImp";


    /**
     *
     * image格式 及 操作系统平台 两个维度可以独立变换扩展
     *
     * @param
     * @author zhangjj
     * @Date 2018/3/21 16:36
     * @return 
     * @exception 
     * 
     */
    @Test
    public void clientTest(){
        Image image = getInstance(ABSTRACTION_CLASSNAME);
        ImageImp imp = getInstance(IMPLEMENTOR_CLASSNAME);
        image.setImageImp(imp);

        image.parseFile("test.bmp");
    }


    private <T> T getInstance(String className){

        try {
            Class<T> aClass = (Class<T>) Class.forName(className);
            return aClass.newInstance();
        } catch (Exception e) {
            logger.error("", e);
        }

        return null;
    }
}
