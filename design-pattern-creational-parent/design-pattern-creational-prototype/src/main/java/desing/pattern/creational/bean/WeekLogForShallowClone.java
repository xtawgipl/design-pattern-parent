package desing.pattern.creational.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 周报类，充当ConcretePrototype角色
 *
 * 浅克隆 实现
 *
 * @author zhangjj
 * @create 2018-03-20 10:56
 **/
public class WeekLogForShallowClone implements ILog, Cloneable{

    private Logger logger = LoggerFactory.getLogger(WeekLogForShallowClone.class);

    private String name;

    private Attachment attachment;

   /**
    * 浅克隆:
    * 在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；
    * 如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，
    * 也就是说原型对象和克隆对象的成员变量指向相同的内存地址。简单来说，在浅克隆中，
    * 当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制
    *
    * @param
    * @author zhangjj
    * @Date 2018/3/20 11:05
    * @return
    * @exception
    *
    */
    @Override
    public ILog clone() {
        try {
            return (ILog) super.clone();
        } catch (CloneNotSupportedException e) {
            logger.error("", e);
        }
        return null;
    }

    @Override
    public void display() {
        logger.info("{} 的工作周报，附件 {}", name, attachment,getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
