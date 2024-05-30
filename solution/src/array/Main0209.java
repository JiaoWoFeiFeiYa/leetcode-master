package array;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/description/">0209</a>
 */
public class Main0209 {

    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + sum >= target) {
                    if (result > j - i + 1) result = j - i + 1;
                    break;
                } else {
                    sum += nums[j];
                }
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    // 滑动窗口
    public int minSubArrayLen2(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0, end = 0;

        while (end < nums.length) {
            sum += nums[end];
            while (sum >= target) {
                result = Math.min(result, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int target = 213;
        int result = new Main0209().minSubArrayLen(target, nums);
        System.out.println(result);
    }

}
