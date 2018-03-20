package desing.pattern.creational.factory;

import desing.pattern.creational.buss.MailSender;
import desing.pattern.creational.buss.Sender;
import desing.pattern.creational.buss.SmsSender;

/**
 * 工厂方法
 *
 * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，
 * 可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，
 * 不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，
 * 我们会选用第三种——静态工厂方法模式。
 *
 * @author zhangjj
 * @create 2018-03-19 13:53
 **/
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
