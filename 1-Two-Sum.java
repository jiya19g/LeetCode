class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        // The key is the number and the value is its index in the array
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Step 1: Build the hash table
        // Iterate over the array and store each number and its index in the hash map
        // This allows for O(1) lookups later when searching for the complement
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Step 2: Find the complement
        // Iterate over the array again and for each number, calculate its complement
        // The complement is the number we need to add to the current number to reach the target
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the hash map
            // Also, ensure that the complement is not the same element as nums[i]
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{i, numMap.get(complement)};
            }
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }
}

/*
    Time Complexity: O(n)
    - We traverse the array twice: 
      1. Once to build the hash map (O(n)).
      2. Another time to find the complement for each number (O(n)).
    - Thus, the overall time complexity is O(n).

    Space Complexity: O(n)
    - The hash map stores up to n elements, where n is the length of the array.
    - Therefore, the space complexity is O(n).
*/
