package desing.pattern.structural.facede;

import desing.pattern.structural.module.CPU;
import desing.pattern.structural.module.Disk;
import desing.pattern.structural.module.Memory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 门面类（核心）
 *
 * 外观模式中，一个子系统的外部与其内部的通信通过一个统一的外观类进行，
 * 外观类将客户类与子系统的内部复杂性分隔开，使得客户类只需要与外观角色打交道，
 * 而不需要与子系统内部的很多对象打交道。
 *
 * 应用场景 ：
 *    (1) 当要为访问一系列复杂的子系统提供一个简单入口时可以使用外观模式。
 *    (2) 客户端程序与多个子系统之间存在很大的依赖性。引入外观类可以将子系统与客户端解耦，
 *        从而提高子系统的独立性和可移植性。
 *    (3) 在层次化结构中，可以使用外观模式定义系统中每一层的入口，层与层之间不直接产生联系，
 *        而通过外观类建立联系，降低层之间的耦合度。
 *
 * @author zhangjj
 * @create 2018-03-21 13:51
 **/
public class Computer {

    private Logger logger = LoggerFactory.getLogger(Computer.class);

    private CPU    cpu;
    private Memory memory;
    private Disk   disk;

    public Computer(){
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start(){
        logger.info("Computer start begin");
        cpu.start();
        disk.start();
        memory.start();
        logger.info("Computer start end");
    }
}
