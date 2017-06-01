package offer.data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lnjasdf on 2017/6/1.
 */
public class TreeAlgorithm<T> implements ITreeAlgorithm<T> {
    @Override
    public void preorderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        preorder(tree, treeNode);
    }

    private void preorder(ITree<T> node, ITreeNode<T> treeNode) {
        treeNode.node(node);
        if (node.hasLeft())
            preorder(node.getLeft(), treeNode);
        if (node.hasRight())
            preorder(node.getRight(), treeNode);
    }

    @Override
    public void inorderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        inorder(tree, treeNode);
    }

    private void inorder(ITree<T> node, ITreeNode<T> treeNode) {
        if (node.hasLeft())
            preorder(node.getLeft(), treeNode);
        treeNode.node(node);
        if (node.hasRight())
            preorder(node.getRight(), treeNode);
    }

    @Override
    public void postorderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        postorder(tree, treeNode);
    }

    private void postorder(ITree<T> node, ITreeNode<T> treeNode) {
        if (node.hasLeft())
            preorder(node.getLeft(), treeNode);
        if (node.hasRight())
            preorder(node.getRight(), treeNode);
        treeNode.node(node);
    }

    @Override
    public void levelOrderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        Queue<ITree<T>> queue = new LinkedList<>();
        queue.offer(tree);
        while (queue.size() > 0) {
            ITree<T> node = queue.poll();
            treeNode.node(node);
            if (node.hasLeft())
                queue.offer(node.getLeft());
            if (node.hasRight())
                queue.offer(node.getRight());
        }
    }

    @Override
    public List<T> Serialize(ITree<T> tree) {
        if (tree == null)
            return null;
        List<T> res = new LinkedList<>();
        res.add(tree.getValue());
        Queue<ITree<T>> queue = new LinkedList<>();
        queue.offer(tree);
        while (queue.size() > 0) {
            ITree<T> node = queue.poll();
            if (node.hasLeft()) {
                queue.offer(node.getLeft());
                res.add(node.getLeft().getValue());
            } else {
                res.add(null);
            }
            if (node.hasRight()) {
                queue.offer(node.getRight());
                res.add(node.getRight().getValue());
            } else {
                res.add(null);
            }
        }
        return res;
    }

    @Override
    public ITree<T> Deserialize(List<T> list) {
        if (list == null)
            return null;
        return null;
    }
}
