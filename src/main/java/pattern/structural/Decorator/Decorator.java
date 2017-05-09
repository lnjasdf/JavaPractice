package pattern.structural.Decorator;

/**
 * Created by lnjasdf on 2017/5/9.
 * 抽象装饰器
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
