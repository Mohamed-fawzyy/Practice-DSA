class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);

            String sortedS = new String(c);

            map.putIfAbsent(sortedS, new ArrayList<String>());
            map.get(sortedS).add(s);
        }
        res.addAll(map.values());
        
        return res;
    }
}