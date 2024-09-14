/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Base case: if the array is empty or null, return null
        if (nums.length == 0 || nums == null) { 
            return null;
        }
        // Recursively create the BST
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        // Base case: if the start index is greater than the end index, return null
        if (start > end) {
            return null;
        }

        // Find the middle index of the current segment
        int mid = start + (end - start) / 2;

        // Create a new tree node with the middle element
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively create the left subtree
        node.left = createTree(nums, start, mid - 1);

        // Recursively create the right subtree
        node.right = createTree(nums, mid + 1, end);

        return node;
    }
}

/*
 * Time Complexity: O(n)
 * - Each node in the binary search tree is created once, where n is the number of elements in the array.
 * 
 * Space Complexity: O(log n)
 * - The space complexity is due to the recursive call stack, which is O(log n) for a balanced binary search tree.
 */
