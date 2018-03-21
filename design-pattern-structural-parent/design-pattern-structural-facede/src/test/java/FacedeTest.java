import desing.pattern.structural.facede.Computer;
import org.junit.Test;

/**
 * Cilent 测试类
 *
 * @author zhangjj
 * @create 2018-03-21 13:54
 **/
public class FacedeTest {


    @Test
    public void clientTest(){
        Computer computer = new Computer();
        computer.start();
    }
}
