package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/two-sum/description/">0001</a>
 */
public class Main0001 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                return new int[]{map.get(nums[i]), i};
            }

        }

        //可以优化为一个for 循环
        //for (int i = 0; i < nums.length; ++i) {
        //    if (map.containsKey(target - nums[i])) {
        //        return new int[]{map.get(target - nums[i]), i};
        //    }
        //    map.put(nums[i], i);
        //}
        //
        //return new int[2];
    }

    public static void main(String[] args) {
        int[] ints = {0, 4, 3, 0};
        System.out.println(Arrays.toString(new Main0001().twoSum(ints, 0)));
    }

}
