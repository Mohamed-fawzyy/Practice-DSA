class Solution {
    public void reverseString(char[] s) {

        // using a 2 ptr
        int n = s.length;
        int l = 0;
        int r = n - 1;

        while (l != r && l < r){

            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            
            l++;
            r--;
        }
    }
}