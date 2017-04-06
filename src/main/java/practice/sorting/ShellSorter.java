package practice.sorting;

/**
 * Created by lnjasdf on 2017/4/5.
 */
public class ShellSorter implements Sortable {

    public void sort(int[] list) {
        for (int gap = list.length / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < list.length; j += gap) {
                    int tmp = list[j];
                    int h;
                    for ( h = j - gap; h >=0; h -= gap) {
                        if (list[h] > tmp) {
                            list[h + gap] = list[h];
                        } else {
                            break;
                        }
                    }
                    list[h + gap] = tmp;
                }
            }
        }
    }

    public String getName() {
        return "希尔排序";
    }
}
