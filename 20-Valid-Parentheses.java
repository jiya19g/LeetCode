class Solution {
    public boolean isValid(String s) {
        // Step 1: Create an empty stack to keep track of closing brackets
        Deque<Character> stack = new ArrayDeque<>();

        // Step 2: Loop through each character in the string
        for (char c : s.toCharArray()) {
            // Step 3: If the character is an opening bracket, push the corresponding closing bracket onto the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // Step 4: If it's a closing bracket, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                // If the stack is empty (no matching opening bracket) or the top of the stack 
                // doesn't match the current closing bracket, return false
                return false;
            }
        }

        // Step 5: After processing all characters, check if the stack is empty
        // If empty, all opening brackets have been matched properly, return true
        return stack.isEmpty();
    }
}

/*
    Time Complexity: O(n)
    - We traverse the string once, where 'n' is the length of the string.
    - Each operation on the stack (push, pop, isEmpty) takes constant time, so the time complexity is O(n).

    Space Complexity: O(n)
    - In the worst case, we might push all the opening brackets onto the stack.
    - Therefore, the space complexity is O(n), where 'n' is the length of the string.
*/
