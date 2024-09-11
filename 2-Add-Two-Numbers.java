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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Create a dummy node to serve as the head of the result list
        // 'tail' will be used to keep track of the current node
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        // 'carry' is used to store the carry-over value when the sum of two digits exceeds 9
        int carry = 0;

        // Step 2: Loop through both linked lists until both are fully traversed, 
        // and there's no carry left
        while (l1 != null || l2 != null || carry != 0) {
            // Extract the values from l1 and l2, defaulting to 0 if any list is null
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum of the current digits plus any carry from the previous addition
            int sum = d1 + d2 + carry;
            
            // Get the digit to place in the current node (sum % 10)
            int d = sum % 10;
            
            // Calculate the new carry (sum / 10)
            carry = sum / 10;
            
            // Create a new node with the calculated digit and attach it to the result list
            ListNode newNode = new ListNode(d);
            tail.next = newNode;  // Move the tail to the new node
            tail = tail.next;

            // Move to the next node in each list (if it exists)
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        // Step 3: Return the next node of the dummy (which is the actual head of the result list)
        ListNode result = dummy.next;
        
        // Disconnect the dummy node to prevent any potential memory issues
        dummy.next = null;

        return result;   
    }
}

/*
    Time Complexity: O(max(m, n))
    - m is the length of l1, n is the length of l2.
    - We iterate through the longer of the two linked lists.
    - Therefore, the time complexity is O(max(m, n)).

    Space Complexity: O(max(m, n))
    - The space used by the result linked list is proportional to the longer input list.
    - Therefore, the space complexity is O(max(m, n)).
*/
