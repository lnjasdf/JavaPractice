package offer;

import offer.utils.PrintUtils;

/**
 * Created by lnjasdf on 2017/5/31.
 * 问题14：调整数组顺序使奇数位于偶数前面
 */
public class Question14 {

    public interface IOrder<T> {
        boolean front(T t);
    }

    public static class IntegerOrder implements IOrder<Integer> {

        @Override
        public boolean front(Integer integer) {
            return integer % 2 > 0;
        }
    }

    public static <T> void orderList(T[] list, IOrder<T> order) {
        if (list == null || list.length < 2) {
            return;
        }
        int begin = 0, end = list.length - 1;
        while (begin < end) {
            while (begin < end && order.front(list[begin])) {
                begin++;
            }
            while (begin < end && !order.front(list[end])) {
                end--;
            }
            if (begin < end) {
                T tmp = list[begin];
                list[begin] = list[end];
                list[end] = tmp;
            }
        }
    }

    static private Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public static void main(String[] args) {
        orderList(list, new IntegerOrder());
        PrintUtils.printList(list);
    }
}
