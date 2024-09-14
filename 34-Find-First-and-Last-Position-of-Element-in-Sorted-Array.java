class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};  // Initialize the result array with -1, -1 for no match
        ans[0] = search(nums, target, true);  // Find the first occurrence of target
        ans[1] = search(nums, target, false);  // Find the last occurrence of target
        return ans;  // Return the result array
    }

    // Helper function to search for the target element
    public int search(int[] nums, int target, boolean isStart) {
        int start = 0, end = nums.length - 1;
        int ans = -1;  // Initialize answer to -1 (not found)
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Avoid potential overflow by using this formula
            if (target > nums[mid]) {
                start = mid + 1;  // Search the right half
            } else if (target < nums[mid]) {
                end = mid - 1;  // Search the left half
            } else {
                ans = mid;  // Target found, store the index
                if (isStart) {
                    end = mid - 1;  // Narrow search for the first occurrence
                } else {
                    start = mid + 1;  // Narrow search for the last occurrence
                }
            }
        }
        return ans;  // Return the found index or -1 if not found
    }
}

/*
 * Time Complexity: O(log n)
 * - Binary search runs in O(log n) time, where n is the length of the array.
 * - We perform binary search twice (for the first and last occurrences), so the time complexity is still O(log n).
 *
 * Space Complexity: O(1)
 * - The algorithm uses constant space to store variables.
 */
