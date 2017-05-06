package pattern.structural.Adapter;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/6.
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        out.println("target operation");
    }
}
