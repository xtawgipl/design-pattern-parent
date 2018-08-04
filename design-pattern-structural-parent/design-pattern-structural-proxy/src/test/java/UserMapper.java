import java.util.Map;

/**
 * @author zhangjj
 * @create 2018-08-03 14:47
 **/
public interface UserMapper {

    int insert();

    int delete();

    int update();

    Map<String, String> select();
}
