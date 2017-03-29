package practice.sorting;

/**
 * Created by intron on 2016/8/24 0024.
 * 插入排序
 */
public class InsertSorter implements Sortable{

    public void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j = i-1; j >= 0; j--) {
                if (list[j] > temp) {
                    list[j+1] = list[j];
                } else {
                    break;
                }
            }
            list[j+1] = temp;
        }
    }

    public String getName() {
        return "插入排序";
    }

}
