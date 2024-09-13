class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Iterate through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Initialize low and high pointers for binary search within the row
            int low = 0, high = matrix[i].length - 1;

            // Perform binary search within the row
            while (low <= high) {
                int mid = low + (high - low) / 2;

                // If the target is found, return true
                if (matrix[i][mid] == target)
                    return true;
                // If the target is smaller, narrow the search to the left half
                else if (matrix[i][mid] > target)
                    high = mid - 1;
                // If the target is larger, narrow the search to the right half
                else
                    low = mid + 1;
            }
        }
        // If the target is not found in any row, return false
        return false;
    }
}

/*
 * Time Complexity: O(m * log n)
 * - m is the number of rows.
 * - n is the number of columns.
 * - We perform binary search on each row, which takes O(log n) for each row.
 * 
 * Space Complexity: O(1)
 * - The algorithm uses a constant amount of extra space.
 */
