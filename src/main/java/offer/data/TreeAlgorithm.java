package offer.data;

import java.util.*;

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
        if (list == null || list.size() % 2 == 0)
            return null;
        Iterator<T> iterator = list.iterator();
        T value = iterator.next();
        ITree<T> head = new TreeNode<>(value);
        Queue<ITree<T> > queue = new LinkedList<>();
        queue.add(head);
        int num = 1;
        while (iterator.hasNext()) {
            int count = 0;
            for (int i = 0; i < num; i++) {
                T leftValue = iterator.hasNext() ? iterator.next() : null;
                T rightValue = iterator.hasNext() ? iterator.next() : null;
                ITree<T> node = queue.poll();
                if (leftValue != null) {
                    ITree<T> left = new TreeNode<>(leftValue);
                    node.setLeft(left);
                    queue.add(left);
                    count++;
                }
                if (rightValue != null) {
                    ITree<T> right = new TreeNode<>(rightValue);
                    node.setRight(right);
                    queue.add(right);
                    count++;
                }
            }
            num = count;
        }
        return head;
    }

    private static class PrintTreeNode implements  ITreeNode {

        @Override
        public void node(ITree node) {
            if (node != null) {
                System.out.print(node.getValue() + " ");
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, null, null, null, 9, null, null, null, null};
        TreeAlgorithm<Integer> algorithm = new TreeAlgorithm<>();
        ITree<Integer> tree = algorithm.Deserialize(Arrays.asList(array));
        algorithm.preorderTraversal(tree, new PrintTreeNode());
        System.out.println();
        algorithm.inorderTraversal(tree, new PrintTreeNode());
        System.out.println();
        algorithm.postorderTraversal(tree, new PrintTreeNode());
        System.out.println();
        algorithm.levelOrderTraversal(tree, new PrintTreeNode());
        System.exit(1);
    }
}
