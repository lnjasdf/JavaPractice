package practice.sorting;

/**
 * Created by intron on 2017/3/30 0030.
 * 时间复杂度 O(N*logN)
 */
public class MergeSorter implements Sortable {

    public void sort(int[] list) {
        mergeSort(list, 1);
    }

    private void mergeSort(int[] list, int len) {
        int child = list.length / len;
        int group = child / 2;
        int other = group * 2 * len;
        if (group == 0)
            return;
        for (int i = 0; i < group; i++) {
            int step = i * 2;
            merge(list, step * len, (step + 1) * len, (step + 2) * len);
        }
        if (other > 0 && other < list.length) {
            merge(list, other - len * 2, other, list.length);
        }
        mergeSort(list, 2 * len);
    }

    private void merge(int[] list, int begin, int middle, int end) {
        int[] temp = new int[end - begin];
        int i = begin, j = middle, k = 0;
        while (i < middle && j < end) {
            if (list[i] < list[j]) {
                temp[k] = list[i];
                i++;
            } else {
                temp[k] = list[j];
                j++;
            }
            k++;
        }
        while (i < middle) {
            temp[k] = list[i];
            i++;
            k++;
        }
        while (j < end) {
            temp[k] = list[j];
            j++;
            k++;
        }
        System.arraycopy(temp, 0, list, begin, temp.length);
    }

    public String getName() {
        return "归并排序";
    }
}
