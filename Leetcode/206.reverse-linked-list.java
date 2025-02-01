/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null; // Edge case: empty list

        ListNode PrevNode = null; // Start with PrevNode as null
        ListNode CurrNode = head; // Start with CurrNode at the head of the list

        while (CurrNode != null) {
            ListNode NextNode = CurrNode.next; // Save the next node
            CurrNode.next = PrevNode; // Reverse the current node's pointer
            PrevNode = CurrNode; // Move PrevNode one step forward
            CurrNode = NextNode; // Move CurrNode one step forward
        }

        return PrevNode; // Return the new head (previously the last node)
    }
}

// @lc code=end
