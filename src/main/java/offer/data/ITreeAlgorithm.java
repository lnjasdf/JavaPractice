package offer.data;

import java.util.List;

/**
 * Created by lnjasdf on 2017/6/1.
 */
public interface ITreeAlgorithm<T> {
    // 前序遍历
    void preorderTraversal(ITree<T> tree, ITreeNode<T> treeNode);
    // 中序遍历
    void inorderTraversal(ITree<T> tree, ITreeNode<T> treeNode);
    // 后序遍历
    void postorderTraversal(ITree<T> tree, ITreeNode<T> treeNode);
    // 层序遍历/广度优先遍历
    void levelOrderTraversal(ITree<T> tree, ITreeNode<T> treeNode);
    // 序列化
    List<T> Serialize(ITree<T> tree);
    // 反序列化
    ITree<T> Deserialize(List<T> list);
}
