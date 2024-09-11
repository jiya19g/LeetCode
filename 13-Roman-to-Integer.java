class Solution {
    public int romanToInt(String s) {
        int c = 0, arr[] = new int[s.length()], j = 0;

        // Step 1: Convert each Roman numeral character into its integer equivalent
        // We store these integer values in an array 'arr'
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I': // Roman numeral 'I' is 1
                    arr[i] = 1;
                    break;
                case 'V': // Roman numeral 'V' is 5
                    arr[i] = 5;
                    break;
                case 'X': // Roman numeral 'X' is 10
                    arr[i] = 10;
                    break;
                case 'L': // Roman numeral 'L' is 50
                    arr[i] = 50;
                    break;
                case 'C': // Roman numeral 'C' is 100
                    arr[i] = 100;
                    break;
                case 'D': // Roman numeral 'D' is 500
                    arr[i] = 500;
                    break;
               default:  // Roman numeral 'M' is 1000
                    arr[i] = 1000;
                    break;
            }
        }
        
        // Step 2: Traverse through the array to calculate the integer value
        // For cases like 'IV' (4), 'IX' (9), etc., subtract the smaller value from the larger value
        for (j = 0; j < s.length() - 1; j++) {
            if (arr[j] < arr[j + 1]) 
                c -= arr[j]; // If the current numeral is smaller than the next one, subtract it
            else 
                c += arr[j]; // Otherwise, add it to the result
        }

        // Add the last numeral to the total (as it has no next numeral to compare with)
        c += arr[j];
        return c;
    }
}

/*
    Time Complexity: O(n)
    - We iterate through the string twice: 
      1. Once to convert each Roman numeral to its integer equivalent (O(n)).
      2. Another time to compute the final integer value (O(n)).
    - Therefore, the total time complexity is O(n), where n is the length of the string.

    Space Complexity: O(n)
    - We use an array 'arr' to store the integer values for each Roman numeral character, which takes O(n) space.
    - Thus, the space complexity is O(n), where n is the length of the string.
*/
