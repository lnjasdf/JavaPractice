package offer.utils;

/**
 * Created by lnjasdf on 2017/5/31.
 */
public class PrintUtils {

    public static <T> void printList(T[] list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
