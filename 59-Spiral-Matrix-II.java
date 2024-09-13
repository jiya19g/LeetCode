class Solution {
    public int[][] generateMatrix(int n) {
        // Initialize the matrix and the current number to be filled
        int c = 1;
        int mat[][] = new int[n][n];
        
        // If n is 0, return null (no matrix to generate)
        if (n == 0)
            return null;
        
        // Define the boundaries for the spiral traversal
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        // Continue filling the matrix while the boundaries are valid
        while (top <= bottom && left <= right) {
            // Traverse from left to right across the top boundary
            for (int i = left; i <= right; i++) {
                mat[top][i] = c++;
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = c++;
            }
            right--; // Move the right boundary left

            // Check if there is still a row to fill, then traverse right to left
            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = c++;
                }
                bottom--; // Move the bottom boundary up
            }

            // Check if there is still a column to fill, then traverse bottom to top
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = c++;
                }
                left++; // Move the left boundary right
            }
        }

        return mat; // Return the filled spiral matrix
    }
}

/*
 * Time Complexity: O(n^2)
 * - The matrix has n^2 elements, and each element is filled exactly once.
 * 
 * Space Complexity: O(n^2)
 * - We use a matrix of size n x n to store the result.
 */
