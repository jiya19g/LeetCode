class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Handle edge cases:
        // - If numRows is 0, return an empty list.
        // - If numRows is 1, return a list with a single row [1].
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        
        // Recursively generate the previous rows of Pascal's Triangle
        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();
        
        // Initialize the new row with 1s
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }
        
        // Compute the values of the new row based on the values of the previous row
        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
        }
        
        // Add the new row to the list of previous rows and return the result
        prevRows.add(newRow);
        return prevRows;
    }
}

/*
 * Time Complexity: O(numRows^2)
 * - Each row computation involves iterating through the previous row and the new row.
 * 
 * Space Complexity: O(numRows^2)
 * - The space complexity is mainly due to the storage of the triangle's rows in the list.
 */
