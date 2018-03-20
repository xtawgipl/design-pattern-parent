package desing.pattern.creational.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * 周报类，充当ConcretePrototype角色
 *
 * 深克隆实现
 *
 * @author zhangjj
 * @create 2018-03-20 11:11
 **/
public class WeekLogForDeepClone implements ILog, Serializable{

    private Logger logger = LoggerFactory.getLogger(WeekLogForDeepClone.class);

    private String name;

    private Attachment attachment;

    /**
     * 深克隆:
     * 在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，
     * 深克隆将原型对象的所有引用对象也复制一份给克隆对象。简单来说，在深克隆中，除了对象本身被复制外，
     * 对象所包含的所有成员变量也将复制
     *
     * 深克隆实现方法：
     * 1、ObjectOutputStream，hessian，kryo，jboss-serialization，protostuff，fastjson等序列化工具
     * 2、递归调用 Object.clone 方法
     * 3、使用 get set原始方法
     * 4、其他
     * 
     * @param
     * @author zhangjj
     * @Date 2018/3/20 11:20
     * @return 
     * @exception 
     * 
     */
    @Override
    public ILog clone() {
        try {
            /**
             * 对象写入内存————序列化
             */
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            /**
             * 从内存中读出————反序列化
             */
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
            return (ILog) ois.readObject();
        } catch (Exception e) {
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
