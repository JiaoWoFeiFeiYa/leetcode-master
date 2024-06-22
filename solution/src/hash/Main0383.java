package hash;

/**
 * <a href="https://leetcode.cn/problems/ransom-note/submissions/541166166/">383</a>
 */
public class Main0383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] charArray = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            charArray[ransomNote.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < magazine.length(); i++) {
            charArray[magazine.charAt(i) - 'a'] -= 1;
        }

        for (int j : charArray) {
            if (j > 0) return false;
        }

        return true;
    }

}
