class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Get the number of rows and columns in the matrix
        int row = matrix.length;
        int col = matrix[0].length;
        
        // Initialize a list to store the spiral order of matrix elements
        List<Integer> list = new ArrayList<>();
        
        // Edge case: If the matrix has no rows or columns, return an empty list
        if (row == 0 || col == 0) return list;

        // Define boundaries for traversal
        int left = 0, right = col - 1, top = 0, bottom = row - 1;
        
        // Loop until the boundaries overlap, indicating that all elements have been traversed
        while (top <= bottom && left <= right) {
            // Traverse the top row from left to right
            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);
            top++;

            // Traverse the right column from top to bottom
            for (int i = top; i <= bottom; i++)
                list.add(matrix[i][right]);
            right--;

            // Traverse the bottom row from right to left if there are remaining rows
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }

            // Traverse the left column from bottom to top if there are remaining columns
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        
        // Return the list containing the elements in spiral order
        return list;
    }
}

/*
 * Time Complexity: O(m * n)
 * - m is the number of rows and n is the number of columns.
 * - Each element in the matrix is visited exactly once, so the time complexity is proportional to the total number of elements.
 * 
 * Space Complexity: O(1)
 * - Apart from the result list, the algorithm uses a constant amount of space, as we are only modifying the list and boundaries. 
 * - The result list itself takes O(m * n) space, but that is required for storing the result.
 */
