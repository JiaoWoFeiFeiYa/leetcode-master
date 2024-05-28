package array;


/**
 *  <a href="https://leetcode.cn/problems/binary-search/">main 0704 </a>
 *  binary search
 */

public class Main0704 {
    /**
     * 暴力
     */
    public int search(int[] nums, int target) {
        int result = 0;
        for (int num : nums) {
            if (target == num) return result;
            result++;
        }

        return -1;
    }

    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left)/2 + left;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = right - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main0704 main0704 = new Main0704();

        int[] nums = new int[]{5};
        int target = 5;
        int i = main0704.binarySearch(nums, target);
        System.out.println(i);
    }
}
