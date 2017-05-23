package offer;

/**
 * Created by lnjasdf on 2017/5/23.
 * 面试题3：二维数组中的查找
 */
public class Question3 {
    private static final int[][] matrix = {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 14},
            {6, 8, 11, 15}
    };

    private static final boolean findMatrix(int[][] matrix, int value) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j > -1) {
            int v = matrix[i][j];
            System.out.println(v);
            if (v == value)
                return true;
            else if (v > value)
                j--;
            else if (v < value)
                i++;
        }
        return false;
    }

    public static final boolean find(int[][] matrix, int value) {
        if (matrix.length == 0)
            return false;
        int length = matrix[0].length;
        for (int[] ints : matrix) {
            if (ints.length != length)
                return false;
        }
        return findMatrix(matrix, value);
    }

    public static void main(String[] args) {
        System.out.println(find(matrix, 4));
    }
}
