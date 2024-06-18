package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/4sum-ii/description/">四数相加 II</a>
 */
public class Main0454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int value : nums1) {
            for (int i : nums2) {
                int sum = value + i;
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }

        int count = 0;
        for (int j : nums3) {
            for (int k : nums4) {
                if (map.containsKey(-j - k)) {
                    count += map.get(-j - k);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {-1, -2};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        System.out.println(new Main0454().fourSumCount(a, b, c, d));
    }

}
