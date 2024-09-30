class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.put(nums[i], 0);
        }

        if (n != map.size()) return true;

        return false;
    }
}