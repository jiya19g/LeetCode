class Solution {
    public int removeDuplicates(int[] nums) {
        // Step 1: Initialize 'j' to track the position of the next unique element
        // Start at 1 since the first element is always considered unique
        int j = 1;

        // Step 2: Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Step 3: If the current element is not equal to the previous element
            if (nums[i] != nums[i - 1]) {
                // Place the current unique element at index 'j'
                nums[j] = nums[i];
                // Increment 'j' to move to the next position for the next unique element
                j++;
            }
        }

        // Step 4: Return 'j', which represents the number of unique elements
        return j;
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
