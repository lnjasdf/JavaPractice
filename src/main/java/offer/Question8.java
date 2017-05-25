package offer;

/**
 * Created by lnjasdf on 2017/5/24.
 * 问题8：旋转数组的最小数字
 */
public class Question8 {
    private static final int[] list1 = {3, 4, 5, 1, 2};
    private static final int[] list2 = {1, 2, 3, 4, 5};
    private static final int[] list3 = {1, 0, 1, 1, 1};

    public static int min(int[] list) {
        if (list == null || list.length == 0)
            throw new RuntimeException();
        int index1 = 0;
        int index2 = list.length - 1;
        int indexMid = index1;
        while (list[index1] >= list[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            if (list[index1] < list[indexMid])
                index1 = indexMid;
            else if (list[index2] > list[indexMid])
                index2 = indexMid;
            else if (list[index1] == list[indexMid] && list[index1] == list[index2]) {
                return minInOrder(list, index1, index2);
            }
        }
        return list[indexMid];
    }

    private static int minInOrder(int[] list, int begin, int end) {
        int result = list[begin];
        for (int i = begin; i <= end; i++) {
            if (list[i] < result)
                result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(min(list1));
        System.out.println(min(list2));
        System.out.println(min(list3));
    }
}
