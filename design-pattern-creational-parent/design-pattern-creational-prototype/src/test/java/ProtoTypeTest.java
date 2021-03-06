import desing.pattern.structural.cls.bean.Attachment;
import desing.pattern.structural.cls.bean.WeekLogForDeepClone;
import desing.pattern.structural.cls.bean.WeekLogForShallowClone;
import org.junit.Assert;
import org.junit.Test;

/**
 * 原型模式测试类,充当 client 角色
 *
 *
 * 原型模式作为一种快速创建大量相同或相似对象的方式，在软件开发中应用较为广泛，
 * 很多软件提供的复制(Ctrl + C)和粘贴(Ctrl + V)操作就是原型模式的典型应用，
 * 下面对该模式的使用效果和适用情况进行简单的总结
 *
 * 适用场景:
 * (1) 创建新对象成本较大（如初始化需要占用较长的时间，占用太多的CPU资源或网络资源），
 *     新的对象可以通过原型模式对已有对象进行复制来获得，如果是相似对象，则可以对其成员变量稍作修改。
 * (2) 如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占用内存较少时，可以使用原型模式配合备忘录模式来实现。
 *     ————如工作流需要保存中间状态、邮件文档等模板需要编辑保存等
 * (3) 需要避免使用分层次的工厂类来创建分层次的对象，并且类的实例对象只有一个或很少的几个组合状态，
 *     通过复制原型对象得到新实例可能比使用构造函数创建一个新实例更加方便。
 *
 * @author zhangjj
 * @create 2018-03-20 11:26
 **/
public class ProtoTypeTest {

    @Test
    public void shallowCloneTest(){
        WeekLogForShallowClone weekLogForShallowClone = new WeekLogForShallowClone();
        Attachment attachment = new Attachment();
        attachment.setAttachName("设计文档.doc");
        weekLogForShallowClone.setName("zhangjj");
        weekLogForShallowClone.setAttachment(attachment);

        WeekLogForShallowClone weekLogForShallowClone2 = (WeekLogForShallowClone) weekLogForShallowClone.clone();

        Assert.assertNotEquals(weekLogForShallowClone, weekLogForShallowClone2);
        Assert.assertEquals(weekLogForShallowClone.getAttachment(), weekLogForShallowClone2.getAttachment());
    }


    @Test
    public void deepCloneTest(){
        WeekLogForDeepClone weekLogForDeepClone = new WeekLogForDeepClone();
        Attachment attachment = new Attachment();
        attachment.setAttachName("设计文档.doc");
        weekLogForDeepClone.setName("zhangjj");
        weekLogForDeepClone.setAttachment(attachment);

        WeekLogForDeepClone weekLogForShallowClone2 = (WeekLogForDeepClone) weekLogForDeepClone.clone();

        Assert.assertNotEquals(weekLogForDeepClone, weekLogForShallowClone2);
        Assert.assertNotEquals(weekLogForDeepClone.getAttachment(), weekLogForShallowClone2.getAttachment());
    }

}
