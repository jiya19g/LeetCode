class Solution {
public boolean isPalindrome(int x) {
int xO = x, xN = 0;

    while(x>0){
        int R = x%10;
        xN = xN*10 + R;
        x = x/10;
    }

    if (xO == xN) return true;
    return false; 

    
}
}