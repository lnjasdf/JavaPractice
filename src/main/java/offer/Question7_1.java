package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lnjasdf on 2017/5/24.
 * 问题7.1：两个队列实现栈
 */
public class Question7_1<T> {
    Queue<T> queue1 = new LinkedList<>();
    Queue<T> queue2 = new LinkedList<>();

    public int push(T element) {
        if (queue1.size() != 0) {
            queue1.add(element);
        } else {
            queue2.add(element);
        }
        return queue1.size() + queue2.size();
    }

    public T pop() {
        Queue<T> hasElemQueue = queue1.size() > 0 ? queue1 : queue2;
        Queue<T> emptyQueue = queue1.size() > 0 ? queue2 : queue1;
        int count = hasElemQueue.size();
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                return hasElemQueue.remove();
            }
            emptyQueue.add(hasElemQueue.remove());
        }
        return null;
    }

    public T peek() {
        Queue<T> hasElemQueue = queue1.size() > 0 ? queue1 : queue2;
        Queue<T> emptyQueue = queue1.size() > 0 ? queue2 : queue1;
        int count = hasElemQueue.size();
        T countElem = null;
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                countElem = hasElemQueue.remove();
                emptyQueue.add(countElem);
            }
            emptyQueue.add(hasElemQueue.remove());
        }
        return countElem;
    }

    public int size() {
        return queue1.size() + queue2.size();
    }

}
