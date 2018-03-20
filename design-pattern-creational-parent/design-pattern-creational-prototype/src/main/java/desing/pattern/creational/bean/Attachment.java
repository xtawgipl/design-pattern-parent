package desing.pattern.creational.bean;

import java.io.Serializable;

/**
 * 附件，引用类
 *
 * @author zhangjj
 * @create 2018-03-20 10:58
 **/
public class Attachment implements Serializable{

    private String attachName;

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }
}
