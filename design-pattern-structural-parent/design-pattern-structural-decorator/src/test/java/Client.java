import desing.pattern.structural.ConcreteComponent;
import desing.pattern.structural.ConcreteDecoratorA;
import desing.pattern.structural.ConcreteDecoratorB;
import org.junit.Test;

/**
 * 客户端代码
 *
 * 装饰模式的特点:
 *  （1）装饰对象和真实对象有相同的接口。这样客户端对象就能以和真实对象相同的方式和装饰对象交互。
 *  （2）装饰对象包含一个真实对象的引用。
 *  （3）装饰对象接受所有来自客户端的请求。它把这些请求转发给真实的对象。
 *  （4）装饰对象可以在转发这些请求以前或以后增加一些附加功能。这样就确保了在运行时，
 *      不用修改给定对象的结构就可以在外部增加附加的功能。在面向对象的设计中，通常是通过继承来实现对给定类的功能扩展。
 * 适用性:
 *  （1）需要扩展一个类的功能，或给一个类添加附加职责。
 *  （2）需要动态的给一个对象添加功能，这些功能可以再动态的撤销。
 *  （3）需要增加由一些基本功能的排列组合而产生的非常大量的功能，从而使继承关系变的不现实。
 *  （4）当不能采用生成子类的方法进行扩充时。一种情况是，可能有大量独立的扩展，为支持每一种组
 *      合将产生大量的子类，使得子类数目呈爆炸性增长。另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类。
 *
 *  装饰模式与适配器模式的区别：
 *      装饰模式注重 功能增强，在调用目标方法前后会有自身的业务功能执行
 *      而适配器模式注重 适配，主要是为了(通过适配)能调用自身不具备的功能
 * @author zhangjj
 * @create 2018-03-20 16:48
 **/
public class Client {

    @Test
    public void test(){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        a.setComponent(c);
        b.setComponent(a);

        b.operation();
    }
}
