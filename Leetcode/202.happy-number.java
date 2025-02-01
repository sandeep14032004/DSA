/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int num) {
        int remainder, sum;

        while (num != 1 && num != 4) {
            sum = 0;
            while (num > 0) {
                remainder = num % 10;
                sum += (remainder * remainder);
                num /= 10;
            }
            num = sum;
        }

        return num == 1;
    }
}

// @lc code=end
