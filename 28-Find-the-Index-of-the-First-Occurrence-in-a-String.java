class Solution {
    public int strStr(String haystack, String needle) {
        // Step 1: Get the lengths of the haystack and needle strings
        int m = haystack.length();
        int n = needle.length();

        // Step 2: Loop through the haystack, considering only the range where the needle can fit
        // (m - n + 1) ensures we do not check beyond the point where the needle can fit in the haystack
        for (int i = 0; i < m - n + 1; ++i) {
            // Step 3: Extract a substring of length 'n' from the haystack starting at index 'i'
            // and check if it matches the needle
            if (haystack.substring(i, i + n).equals(needle))
                // Step 4: If a match is found, return the starting index 'i'
                return i;
        }

        // Step 5: If no match is found, return -1
        return -1;
    }
}

/*
    Time Complexity: O((m - n + 1) * n) ≈ O(m * n)
    - The outer loop runs (m - n + 1) times, and the 'substring' and 'equals' methods compare up to 'n' characters.
    - Therefore, in the worst case, the time complexity is O(m * n), where 'm' is the length of haystack and 'n' is the length of needle.

    Space Complexity: O(1)
    - The space complexity is O(1) as we are not using any extra space except for a few variables.
*/
