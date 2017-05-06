package pattern.structural.Adapter;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/6.
 */
public class DefaultWrapper implements Target {
    @Override
    public void sampleOperation1() {
        out.println("default operation1");
    }

    @Override
    public void sampleOperation2() {
        out.println("default operation2");
    }
}
