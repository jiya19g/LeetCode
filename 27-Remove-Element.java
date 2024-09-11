class Solution {
    public int removeElement(int[] nums, int val) {
        // Step 1: Initialize a counter 'c' to track the position for non-'val' elements
        int c = 0;

        // Step 2: Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Step 3: If the current element is not equal to the target 'val'
            if (nums[i] != val) {
                // Place the current element at index 'c' and increment 'c'
                nums[c++] = nums[i];
            }
        }

        // Step 4: Return 'c', which represents the number of elements that are not 'val'
        return c;
    }
}

/*
    Time Complexity: O(n)
    - We traverse the array once, where 'n' is the length of the array.
    - Each comparison and assignment takes constant time, so the time complexity is O(n).

    Space Complexity: O(1)
    - The algorithm modifies the input array in place and uses only a few extra variables.
    - Therefore, the space complexity is O(1).
*/
