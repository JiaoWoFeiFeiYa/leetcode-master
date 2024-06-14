package hash;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/happy-number/description/">快乐数</a>
 */
public class Main0202 {

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            int sum = 0;
            while (n > 0) {
                sum += ((n % 10) * (n % 10));
                n /= 10;
            }

            set.add(n);
            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        new Main0202().isHappy(19);
    }
}
