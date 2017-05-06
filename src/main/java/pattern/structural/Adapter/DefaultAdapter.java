package pattern.structural.Adapter;

import static java.lang.System.out;

/**
 * Created by lnjasdf on 2017/5/6.
 */
public class DefaultAdapter extends DefaultWrapper {
    @Override
    public void sampleOperation2() {
        out.println("target operation");
    }
}
