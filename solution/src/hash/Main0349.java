package hash;

import java.util.*;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-arrays/description/">intersection-of-two-arrays</a>
 */
public class Main0349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

}
