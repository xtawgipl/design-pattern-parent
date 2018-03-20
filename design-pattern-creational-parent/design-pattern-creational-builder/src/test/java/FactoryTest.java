import desing.pattern.structural.cls.bean.ProductBean;
import desing.pattern.structural.cls.client.VillaBuilder;
import desing.pattern.structural.cls.client.Director;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试
 *
 * @author zhangjj
 * @create 2018-03-19 14:07
 **/
public class FactoryTest {

    /**
     *
     * 通过 VillaBuilder 创建
     *
     * @param
     * @author zhangjj
     * @Date 2018/3/19 17:42
     * @return
     * @exception
     *
     */
    @Test
    public void constructProductTest(){
        Director director = new Director();
        ProductBean product = director.constructProduct(new VillaBuilder());
        Assert.assertNotEquals(product, null);
    }


}
