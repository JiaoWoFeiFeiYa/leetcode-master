package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/3sum/description/">0015</a>
 */
public class Main0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        if (nums[0] > 0 || nums[nums.length -1] < 0) return result;

        for (int i = 0; i < nums.length; i++) {
            if (i >=1 && nums[i] == nums[i-1]) continue;

            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    while (j < k && nums[k] == nums[--k]);
                }else if (sum < 0) {
                    while (j < k && nums[j] == nums[++j]);
                }else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[k] == nums[--k]);
                    while (j < k && nums[j] == nums[++j]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ints = {0,0,0};
        System.out.println(new Main0015().threeSum(ints));
    }

}
