package practice.sorting;

/**
 * Created by lnjasdf on 2017/4/5.
 * 时间复杂度 O(N*logN)
 */
public class Quicksorter implements Sortable {

    public void sort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private void quickSort(int list[], int begin, int end) {
        int l = begin, h = end, key = list[l];
        while (l < h) {
            while (l < h) {
                if (key < list[h]) {
                    h--;
                } else {
                    int tmp = list[l];
                    list[l] = list[h];
                    list[h] = tmp;
                    l++;
                    break;
                }
            }
            while (l < h) {
                if (key >= list[l]) {
                    l++;
                } else {
                    int tmp = list[l];
                    list[l] = list[h];
                    list[h] = tmp;
                    h--;
                    break;
                }
            }
        }
        list[l] = key;
        if (l > begin) {
            quickSort(list, begin, l - 1);
        }
        if (h < end) {
            quickSort(list, h + 1, end);
        }
    }

    public String getName() {
        return "快速排序";
    }
}
