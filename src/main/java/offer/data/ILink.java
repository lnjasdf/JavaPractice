package offer.data;

/**
 * Created by lnjasdf on 2017/6/1.
 */
public interface ILink<T> {
    ILink<T> getNext();
    void setNext(ILink<T> next);
    boolean hasNext();
    T getValue();
    void setValue(T value);
}
