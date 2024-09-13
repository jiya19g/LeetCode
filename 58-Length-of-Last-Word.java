class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any trailing or leading spaces
        s = s.trim();
        
        // Initialize a counter for the length of the last word
        int count = 0;
        
        // Start from the end of the string and move backward
        int l = s.length() - 1;
        for (int i = l; i >= 0; i--) {
            char ch = s.charAt(i);
            
            // Break the loop if we encounter a space, meaning the last word has ended
            if (ch == ' ') 
                break;
            
            // Increment the counter for each character in the last word
            count++;
        }
        
        // Return the length of the last word
        return count;
    }
}

/*
 * Time Complexity: O(n)
 * - n is the length of the input string.
 * - We process the string once, trimming it and counting the last word, so the time complexity is linear.
 * 
 * Space Complexity: O(1)
 * - The algorithm uses a constant amount of extra space.
 */
