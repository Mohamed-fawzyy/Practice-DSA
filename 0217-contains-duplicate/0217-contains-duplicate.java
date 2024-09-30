class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        if (n == 1) {
            return false;
        }

        map.put(nums[0], 0);
        for (int i = 1; i < n; i++) {

            if (map.containsKey(nums[i])){
                return true;
            }

            map.put(nums[i], 0);
        }

        return false;
    }
}