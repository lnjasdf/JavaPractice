package practice.sorting;

/**
 * Created by intron on 2017/3/29 0029.
 * 冒泡排序
 */
public class BubbleSorter implements Sortable{

    public void sort(int[] list) {
        for (int i=0; i<list.length - 1; i++) {
            for (int j=0; j<list.length - 1 - i; j++) {
                if (list[j] > list[j+1]) {
                    int num = list[j];
                    list[j] = list[j+1];
                    list[j+1] = num;
                }
            }
        }
    }

    public String getName() {
        return "冒泡排序";
    }
}
