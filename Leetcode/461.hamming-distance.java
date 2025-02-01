/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int axorb = x ^ y;
        int c = 0;
        while (axorb != 0) {
            c += 1;
            axorb = axorb & (axorb - 1);
        }
        return c;
    }
}
// @lc code=end
