/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        int flag = 0;
        for (int i : nums) {
            if (intSet.contains(i)) {
                flag = 1;
                break;

            }
            intSet.add(i);
        }
        return flag == 1;
    }
}
// @lc code=end
