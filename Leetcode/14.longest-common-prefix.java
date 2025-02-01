/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String[] arr = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            arr[i] = strs[i];
        }
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(i) == strs[i].charAt(i)) {
                s1 += arr[i].charAt(i);
            } else {
                break;
            }
        }
        return s1;
    }
}
// @lc code=end
