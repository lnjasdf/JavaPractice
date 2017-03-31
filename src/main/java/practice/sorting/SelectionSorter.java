package practice.sorting;

/**
 * Created by intron on 2017/3/30 0030.
 * 选择排序
 * 时间复杂度 O(n^2)
 */
public class SelectionSorter implements Sortable {

    public void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int count = i;
            for (int j = i + 1; j< list.length; j++) {
                if (list[j] < list[i]) {
                    count = j;
                }
            }
            int temp = list[i];
            list[i] = list[count];
            list[count] = temp;
        }
    }

    public String getName() {
        return "选择排序";
    }
}
