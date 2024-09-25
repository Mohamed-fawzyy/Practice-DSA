class Solution {
    int res = 0;
    public int countSubstrings(String s) {
        
        for(int i = 0; i < s.length(); i++){
            palindrom(i,i,s);
            palindrom(i,i+1,s);
        }
        return res;
    }
    public void palindrom(int start, int end, String s){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            res++;
            start--;
            end++;
        }
    }
}