/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
//nums = [2 , 2 , 1 , 3 , 1 , 2 , 2]
class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0], votes = 1;
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majorityElement = nums[i];
            } else if (majorityElement == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majorityElement;
    }
}

// @lc code=end
// int n = nums.length;
// int halfn = n / 2;for(
// int i = 0;i<n;i++)
// {
// int count = 0;
// for (int j = 0; j < n; j++) {
// if (nums[i] == nums[j]) {
// count++;
// }
// }
// if (count > halfn) {
// return nums[i];
// }
// }return-1
// ;