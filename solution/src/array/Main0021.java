package array;

/**
 *  <a href="https://leetcode.cn/problems/remove-element/description/">0021 </a>
 *  remove element
 */
public class Main0021 {

    // 双指针
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int current = 0;
        int result = 0;
        while (current <  nums.length) {
            if (val != nums[current]) {
                nums[result] = nums[current];
                result++;
            }
            current++;
        }

        return result;
    }

    // 双指针优化
    public int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int current = 0;
        //int result = nums.length - 1;  不能等于长度减1，不然结果会少一个
        int result = nums.length;
        while (current <  result) {
            if (val == nums[current]) {
                nums[current] = nums[result-1];
                result--;
            }else {
                current++;
            }
        }

        return result;
    }

}
