package pattern.structural.Adapter;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/6.
 * 对象适配器
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        out.println("target operation");
    }
}
