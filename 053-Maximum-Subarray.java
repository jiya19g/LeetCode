class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store sorted words as keys and lists of their anagrams as values
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each word in the input array
        for (String word : strs) {
            // Convert the word to a character array and sort the characters
            char[] chars = word.toCharArray();
            Arrays.sort(chars);  // Sorting ensures all anagrams will have the same sorted key
            
            // Convert the sorted character array back to a string
            String sortedWord = new String(chars);
            
            // If the sorted word is not already in the map, create a new list for it
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            // Add the original word to the list corresponding to the sorted key
            map.get(sortedWord).add(word);
        }
        
        // Return a list of all the values (anagram groups) from the map
        return new ArrayList<>(map.values());
    }
}

/*
 * Time Complexity: O(n * k log k)
 * - n is the number of words in the input array.
 * - k is the maximum length of a word in the input.
 * - Sorting each word takes O(k log k).
 * 
 * Space Complexity: O(n * k)
 * - We store all words in the map, and each word can be of length k.
 */
