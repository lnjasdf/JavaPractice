package pattern.structural.Decorator;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/9.
 * 具体装饰器2
 */
public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        out.println("concrete decorator 2 begin");
        super.sampleOperation();
        out.println("concrete decorator 2 end");
    }
}
