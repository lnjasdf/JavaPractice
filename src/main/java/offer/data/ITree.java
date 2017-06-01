package offer.data;

/**
 * Created by lnjasdf on 2017/6/1.
 */
public interface ITree<T> {
    ITree<T> getLeft();
    void setLeft(ITree<T> left);
    boolean hasLeft();
    ITree<T> getRight();
    void setRight(ITree<T> right);
    boolean hasRight();
    T getValue();
    void setValue(T value);
}
