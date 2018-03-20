import desing.pattern.structural.cls.buss.Sender;
import desing.pattern.structural.cls.client.Provider;
import desing.pattern.structural.cls.client.SendMailFactory;

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
