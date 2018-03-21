package desing.pattern.structural.statics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态代理
 *
 * 以聚合方式实现的代理主题（还要吧使用继承的方式）
 *
 * @author zhangjj
 * @create 2018-03-21 9:28
 **/
public class AdminPoly implements Manager {
    
    private Logger logger = LoggerFactory.getLogger(AdminPoly.class);

    private Admin admin;

    public AdminPoly(Admin admin) {
        super();
        this.admin = admin;
    }

    @Override
    public void doSomething() {
        logger.info("Log:admin操作开始");
        admin.doSomething();
        logger.info("Log:admin操作结束");
    }
}
