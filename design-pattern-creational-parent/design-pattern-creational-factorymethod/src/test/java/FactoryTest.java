import desing.pattern.structural.cls.client.SendFactory;
import desing.pattern.structural.cls.buss.Sender;

/**
 * 测试
 *
 * @author zhangjj
 * @create 2018-03-19 14:07
 **/
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
