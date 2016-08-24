package practice.sorting;

/**
 * Created by intron on 2016/8/24 0024.
 * 插入排序
 */
public class InsertSort {

    static public void sort(int[] list) {
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

    static public void main(String[] arg) {
        int[] list = {49,38,65,97,76,13,27,49,78,34,12,64,1};
        System.out.println("排序之前：");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        sort(list);
        System.out.println("排序之后：");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}
