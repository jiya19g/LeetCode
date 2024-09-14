class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Store the original value of 'x' in xO
        // xO is used to compare later with the reversed number
        int xO = x, xN = 0;

        // Step 2: Reverse the integer 'x'
        // Continue until all digits of 'x' are processed
        while (x > 0) {
            // Get the last digit of 'x' (R = remainder of division by 10)
            int R = x % 10;
            
            // Build the reversed number (xN) by shifting digits and adding R
            xN = xN * 10 + R;
            
            // Remove the last digit of 'x' (integer division by 10)
            x = x / 10;
        }

        // Step 3: Compare the original number (xO) with the reversed number (xN)
        // If both are equal, the number is a palindrome
        if (xO == xN) return true;
        
        // Otherwise, it's not a palindrome
        return false; 
    }
}

/*
    Time Complexity: O(n)
    - 'n' is the number of digits in the input number 'x'.
    - We iterate over all the digits to reverse the number, so the time complexity is O(n).

    Space Complexity: O(1)
    - We use a constant amount of extra space (xO, xN, R) regardless of the input size.
    - Therefore, the space complexity is O(1).
*/
