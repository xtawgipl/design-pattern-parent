package desing.pattern.structural;

/**
 * 装饰角色
 *
 * @author zhangjj
 * @create 2018-03-20 16:44
 **/
public abstract class Decorator extends Component{

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
