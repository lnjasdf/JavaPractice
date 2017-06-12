package offer.data;

import java.util.*;

/**
 * Created by lnjasdf on 2017/6/1.
 */
public class TreeAlgorithm<T> implements ITreeAlgorithm<T> {
    @Override
    public void preorderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree != null) {
            treeNode.node(tree);
            preorderTraversal(tree.getLeft(), treeNode);
            preorderTraversal(tree.getRight(), treeNode);
        }
    }

    @Override
    public void inorderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree != null) {
            inorderTraversal(tree.getLeft(), treeNode);
            treeNode.node(tree);
            inorderTraversal(tree.getRight(), treeNode);
        }
    }

    @Override
    public void postorderTraversal(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree != null) {
            postorderTraversal(tree.getLeft(), treeNode);
            postorderTraversal(tree.getRight(), treeNode);
            treeNode.node(tree);
        }
    }

    public void preorder(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        Stack<Pair<ITree<T>, Boolean>> stack = new Stack<>();
        stack.push(new Pair<>(tree, false));
        while (!stack.isEmpty()) {
            ITree<T> first = stack.peek().getFirst();
            Boolean second = stack.peek().getSecond();
            stack.pop();
            if (first == null)
                continue;
            if (second) {
                treeNode.node(first);
            } else {
                stack.push(new Pair<>(first.getRight(), false));
                stack.push(new Pair<>(first.getLeft(), false));
                stack.push(new Pair<>(first, true));
            }
        }
    }

    public void inorder(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        Stack<Pair<ITree<T>, Boolean>> stack = new Stack<>();
        stack.push(new Pair<>(tree, false));
        while (!stack.isEmpty()) {
            ITree<T> first = stack.peek().getFirst();
            Boolean second = stack.peek().getSecond();
            stack.pop();
            if (first == null)
                continue;
            if (second) {
                treeNode.node(first);
            } else {
                stack.push(new Pair<>(first.getRight(), false));
                stack.push(new Pair<>(first, true));
                stack.push(new Pair<>(first.getLeft(), false));
            }
        }
    }

    public void postorder(ITree<T> tree, ITreeNode<T> treeNode) {
        if (tree == null)
            return;
        Stack<Pair<ITree<T>, Boolean>> stack = new Stack<>();
        stack.push(new Pair<>(tree, false));
        while (!stack.isEmpty()) {
            ITree<T> first = stack.peek().getFirst();
            Boolean second = stack.peek().getSecond();
            stack.pop();
            if (first == null)
                continue;
            if (second) {
                treeNode.node(first);
            } else {
                stack.push(new Pair<>(first, true));
                stack.push(new Pair<>(first.getRight(), false));
                stack.push(new Pair<>(first.getLeft(), false));
            }
        }
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
        System.out.println();
        algorithm.preorder(tree, new PrintTreeNode());
        System.out.println();
        algorithm.inorder(tree, new PrintTreeNode());
        System.out.println();
        algorithm.postorder(tree, new PrintTreeNode());
        System.exit(1);
    }
}
