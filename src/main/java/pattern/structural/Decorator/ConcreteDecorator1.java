package pattern.structural.Decorator;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/9.
 * 具体装饰器1
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        out.println("concrete decorator 1 begin");
        super.sampleOperation();
        out.println("concrete decorator 1 end");
    }
}
