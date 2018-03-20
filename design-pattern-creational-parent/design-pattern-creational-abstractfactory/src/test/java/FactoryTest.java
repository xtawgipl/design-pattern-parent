import desing.pattern.creational.buss.Sender;
import desing.pattern.creational.factory.Provider;
import desing.pattern.creational.factory.SendMailFactory;

/**
 * 测试
 *
 * @author zhangjj
 * @create 2018-03-19 14:07
 **/
public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
