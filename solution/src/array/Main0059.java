package array;

/**
 *  <a href="https://leetcode.cn/problems/spiral-matrix-ii/description/">0059</a>
 *  螺旋矩阵2
 */
public class Main0059 {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1;
        int current = 1, target = n*n;
        while (current < target) {
            for (int i = left; i < right; i++) {
                result[top][i] = current++;
            }

            for (int i = top; i < bottom; i++) {
                result[i][right] = current++;
            }
            for (int i = right; i > left; i--) {
                result[bottom][i] = current++;
            }
            for (int i = bottom; i > top ; i--) {
                result[i][left] = current++;
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        if (current == target) {
            result[top][left] = current;
        }

        return result;
    }

    public static void main(String[] args) {
        Main0059 main0059 = new Main0059();
        int[][] ints = main0059.generateMatrix(1);
        for (int[] anInt : ints) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(anInt[j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
