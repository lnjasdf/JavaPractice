package offer;

import offer.data.ListNode;

/**
 * Created by lnjasdf on 2017/5/31.
 * 问题13：在 O(1) 时间删除链表节点
 */
public class Question13 {
    public static <T> void deleteNode(ListNode<T> head, ListNode<T> toBeDeleted) {
        if (head == null || toBeDeleted == null) {
            return;
        }
        if (!head.hasNext()) { // 只有一个节点 删除此节点
            head.setValue(null);
        } else if (toBeDeleted.hasNext()) { // 待删除的是中间节点
            ListNode<T> next = toBeDeleted.getNext();
            T nextValue = next.getValue();
            ListNode<T> nextNext = next.getNext();
            toBeDeleted.setValue(nextValue);
            toBeDeleted.setNext(nextNext);
        } else { // 待删除的是尾节点
            ListNode<T> node = head;
            while (node.getNext() != toBeDeleted) {
                node = node.getNext();
            }
            node.getNext().setValue(null);
            node.setNext(null);
        }
    }
}
