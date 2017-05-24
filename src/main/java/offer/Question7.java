package offer;

import java.util.Stack;

/**
 * Created by lnjasdf on 2017/5/24.
 * 问题7：用两个栈实现队列
 */
public class Question7<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public int appendTail(T element) {
        stack1.push(element);
        return stack1.size() + stack2.size();
    }

    public T deleteHead() {
        if (stack1.size() == 0 && stack2.size() == 0) {
            return null;
        }
        if (stack2.size() == 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T getHead() {
        if (stack1.size() == 0 && stack2.size() == 0) {
            return null;
        }
        if (stack2.size() == 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {

    }
}
