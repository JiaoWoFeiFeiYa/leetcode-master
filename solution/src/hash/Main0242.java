package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/valid-anagram/">有效的字母异位词</a>
 */
public class Main0242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c, ++count);
            }else {
                int count = 0;
                map.put(c, count);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }else {
                Integer count = map.get(c);
                map.put(c, --count);
            }
        }

        for (Character c : map.keySet()) {
            Integer i = map.get(c);
            if (i != -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        new Main0242().isAnagram("rat", "car");
    }

}
