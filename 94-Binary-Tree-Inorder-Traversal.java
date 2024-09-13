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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Create a result list to store the inorder traversal
        List<Integer> res = new ArrayList<>();
        // Call the helper function to perform the traversal
        inorder(root, res);
        // Return the result list
        return res;
    }

    // Helper function to perform inorder traversal recursively
    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) 
            return; // Base case: if the node is null, return

        // Recursive call for the left subtree
        inorder(node.left, res);
        // Add the current node's value to the result list
        res.add(node.val);
        // Recursive call for the right subtree
        inorder(node.right, res);
    }
}

/*
 * Time Complexity: O(n) 
 * - n is the number of nodes in the binary tree. Each node is visited once.
 * 
 * Space Complexity: O(n) 
 * - Space is used for the recursion stack and the result list, proportional to the number of nodes.
 */
