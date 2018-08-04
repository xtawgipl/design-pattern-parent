package desing.pattern.structural.mybatis;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangjj
 * @create 2018-08-03 16:42
 **/
@Slf4j
public class TestConnection implements Connection {
    @Override
    public Object execute(String sql) {
        log.info("execute sql : {}", sql);
        return null;
    }
}
