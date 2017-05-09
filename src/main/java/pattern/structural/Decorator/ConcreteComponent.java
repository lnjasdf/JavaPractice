package pattern.structural.Decorator;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/9.
 * 具体构件
 */
public class ConcreteComponent implements Component {
    @Override
    public void sampleOperation() {
        out.println("concrete component");
    }
}
