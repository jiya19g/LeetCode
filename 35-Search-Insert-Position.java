class Solution {
    public int searchInsert(int[] nums, int target) {
        // Step 1: Initialize two pointers, 'left' at the start and 'right' at the end of the array
        int left = 0;
        int right = nums.length - 1;

        // Step 2: Perform binary search
        while (left <= right) {
            // Step 3: Calculate the middle index to avoid overflow
            int mid = left + (right - left) / 2;

            // Step 4: If the target is found at 'mid', return 'mid'
            if (nums[mid] == target) {
                return mid;
            // Step 5: If target is less than the middle element, search the left half
            } else if (nums[mid] > target) {
                right = mid - 1;
            // Step 6: If target is greater, search the right half
            } else {
                left = mid + 1;
            }
        }

        // Step 7: If the target is not found, return 'left' as the insertion position
        return left;        
    }
}

/*
    Time Complexity: O(log n)
    - Binary search reduces the search space by half each iteration, so the time complexity is O(log n), where 'n' is the number of elements in the array.

    Space Complexity: O(1)
    - The space complexity is O(1) because the algorithm only uses a few extra variables (left, right, mid) and no additional data structures.
*/
