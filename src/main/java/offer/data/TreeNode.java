package offer.data;

/**
 * Created by lnjasdf on 2017/6/1.
 */
public class TreeNode<T> implements ITree<T> {
    private ITree<T> left;
    private ITree<T> right;
    private T value;

    public TreeNode() {

    }

    public TreeNode(T value) {
        this.value = value;
    }

    @Override
    public ITree<T> getLeft() {
        return left;
    }

    @Override
    public void setLeft(ITree<T> left) {
        this.left = left;
    }

    @Override
    public boolean hasLeft() {
        return left != null;
    }

    @Override
    public ITree<T> getRight() {
        return right;
    }

    @Override
    public void setRight(ITree<T> right) {
        this.right = right;
    }

    @Override
    public boolean hasRight() {
        return right != null;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }
}
