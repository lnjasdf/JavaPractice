package offer;

import offer.data.ListNode;

import java.util.Stack;

/**
 * Created by lnjasdf on 2017/5/23.
 * 面试题5：从尾到头打印链表
 */
public class Question5 {
    private static final Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8};
    private static final ListNode<Integer> head = ListNode.build(list);

    /**
     * 使用栈
     * @param head
     * @param <T>
     */
    public static <T> void reversedOrderPrint(ListNode<T> head) {
        if (head == null) {
            return;
        }
        Stack<T> stack = new Stack<>();
        ListNode<T> curr = head;
        stack.push(curr.getValue());
        while (curr.hasNext()) {
            curr = curr.getNext();
            stack.push(curr.getValue());
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    /**
     * 使用递归
     * @param head
     * @param <T>
     */
    public static <T> void reversedOrderPrint2(ListNode<T> head) {
        if (head.hasNext()) {
            reversedOrderPrint2(head.getNext());
        }
        System.out.println(head.getValue());
    }


    public static void main(String[] args) {
        ListNode.print(head);
        System.out.println("----------");
        reversedOrderPrint2(head);
    }
}
