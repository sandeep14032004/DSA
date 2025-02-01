/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int uni = 0;
        for (int i : nums) {
            uni = uni ^ i;

        }
        return uni;
    }
}
// @lc code=end
