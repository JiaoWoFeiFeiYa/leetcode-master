package array;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">0977</a>
 * squares-of-a-sorted-array
 */
public class Main0977 {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }

    /**
     * 双指针
     */
    public int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];
        int position = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[position] = nums[i] * nums[i];
                i++;
            }else {
                result[position] = nums[j] * nums[j];
                j--;
            }
            position--;
        }
        return result;
    }
}
