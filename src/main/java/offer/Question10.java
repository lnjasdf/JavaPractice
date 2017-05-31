package offer;

/**
 * Created by lnjasdf on 2017/5/31.
 * 问题10：二进制中1的个数
 */
public class Question10 {
    public static int numberOf1(int n) {
        int count = 0;
        int i = 1;
        while(i != 0) {
            if ((i & n) > 0) {
                count++;
            }
            i <<= 1;
        }
        return count;
    }

    public static void main(String[] argv) {
        System.out.println(numberOf1(0));
    }
}
