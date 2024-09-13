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
        // Handle the case when the input list is empty
        if (head == null)
            return null;

        // Create a dummy node to simplify edge cases and point to the head of the list
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        
        // Initialize prev to keep track of the last node before the duplicates
        ListNode prev = dummy;

        while (head != null) {
            // Check if the current node is a duplicate
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with the same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Connect prev to the node after the last duplicate
                prev.next = head.next;
            } else {
                // No duplicates, move prev to the current node
                prev = prev.next;
            }
            // Move to the next node
            head = head.next;
        }
        
        // Return the next of dummy, which is the head of the modified list
        return dummy.next;
    }
}

/*
 * Time Complexity: O(n)
 * - We iterate through the list once, where n is the number of nodes in the list.
 * 
 * Space Complexity: O(1)
 * - We use a constant amount of extra space.
 */
