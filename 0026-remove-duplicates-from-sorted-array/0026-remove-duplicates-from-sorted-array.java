class Solution {
    public int removeDuplicates(int[] nums) {
        
        //this solution for using a map

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        int i=0;

        for (int e : nums){

            if(!map.containsKey(e)) map.put(e,"");
        }

        for (int e : map.keySet()){
            System.out.println(e);
            nums[i] = e;
            i++;
        }
        return map.size();
    }
}