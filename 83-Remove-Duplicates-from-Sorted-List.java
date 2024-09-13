/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Edge case: If the list is empty, return null.
        if (head == null) return null;

        // Initialize the current node as the head of the list.
        ListNode curr = head;

        // Traverse the list while there are more nodes to examine.
        while (curr != null && curr.next != null) {
            // If the current node's value is equal to the next node's value,
            // bypass the next node (i.e., remove it from the list).
            if (curr.next.val == curr.val) {
                curr.next = curr.next.next;
            } else {
                // Move to the next node.
                curr = curr.next;
            }
        }

        // Return the modified list with duplicates removed.
        return head;
    }
}

/*
 * Time Complexity: O(n)
 * - We traverse the list once, where n is the number of nodes in the list.
 * 
 * Space Complexity: O(1)
 * - We use a constant amount of extra space for pointers.
 */
