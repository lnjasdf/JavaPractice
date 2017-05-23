package offer.data;

/**
 * Created by lnjasdf on 2017/5/23.
 */
public class ListNode<T> {
    private T value;
    private ListNode<T> next;

    public ListNode() {

    }

    public static <T> ListNode<T> build(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode<T> head = new ListNode<>();
        head.setValue(array[0]);
        if (array.length > 1) {
            ListNode<T> curr = head;
            for (int i = 1; i < array.length; i++) {
                ListNode<T> next = new ListNode<>();
                next.setValue(array[i]);
                curr.setNext(next);
                curr = next;
            }
        }
        return head;
    }

    public static <T> void print(ListNode<T> head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        ListNode<T> curr = head;
        System.out.println(curr.getValue());
        while (curr.hasNext()) {
            curr = curr.getNext();
            System.out.println(curr.getValue());
        }
    }

    public boolean hasNext() {
        return next != null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
