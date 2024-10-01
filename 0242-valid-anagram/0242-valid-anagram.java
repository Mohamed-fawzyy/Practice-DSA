class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> charMapCount = new HashMap<>();

        for (char ch : s.toCharArray()){
            charMapCount.put(ch, charMapCount.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : t.toCharArray()){
            
            if(!charMapCount.containsKey(ch)) return false;

            charMapCount.put(ch, charMapCount.get(ch) - 1);
            if(charMapCount.get(ch) < 0) return false;
        }

        return true;
    }
}