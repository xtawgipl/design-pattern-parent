package desing.pattern.structural.mybatis.mapper;

import desing.pattern.structural.mybatis.Connection;
import lombok.extern.slf4j.Slf4j;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * mapper代理
 *
 * @author zhangjj
 * @create 2018-08-03 11:18
 **/
@Slf4j
public class MapperProxy<T> implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        } else if (isDefaultMethod(method)) {
            return invokeDefaultMethod(proxy, method, args);
        }

        String name = method.getName();
        ExcutorHandler excutor = new ExcutorHandler();
        Connection connection = excutor.getConnection();
        if(name.contains("insert")){
            log.info("insert 方法执行");
            connection.execute("insert into user (....)");
            return 0;
        }else if(name.contains("delete")){
            log.info("delete 方法执行");
            connection.execute("delete from user where id = 1");
            return 0;
        }else if(name.contains("update")){
            log.info("update 方法执行");
            connection.execute("update user set name = 'test' where id = 1");
            return 0;
        }else{
            Object result = null;
            Class<?> returnType = method.getReturnType();
            if(returnType.getName().equals(Map.class.getName())){
                result = new HashMap();
            }else{
                result = returnType.newInstance();
            }
            connection.execute("select * from user limit 0, 1");
            return result;
        }
    }


    private Object invokeDefaultMethod(Object proxy, Method method, Object[] args)
            throws Throwable {
        final Constructor<MethodHandles.Lookup> constructor = MethodHandles.Lookup.class
                .getDeclaredConstructor(Class.class, int.class);
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        final Class<?> declaringClass = method.getDeclaringClass();
        return constructor
                .newInstance(declaringClass,
                        MethodHandles.Lookup.PRIVATE | MethodHandles.Lookup.PROTECTED
                                | MethodHandles.Lookup.PACKAGE | MethodHandles.Lookup.PUBLIC)
                .unreflectSpecial(method, declaringClass).bindTo(proxy).invokeWithArguments(args);
    }

    /**
     * Backport of java.lang.reflect.Method#isDefault()
     */
    private boolean isDefaultMethod(Method method) {
        return (method.getModifiers()
                & (Modifier.ABSTRACT | Modifier.PUBLIC | Modifier.STATIC)) == Modifier.PUBLIC
                && method.getDeclaringClass().isInterface();
    }

}
