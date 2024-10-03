
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] res = new int[2];

        if (n == 2)
            return new int[] { 0, 1 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff) && map.get(diff) != i) {

                return new int[]{i, map.get(diff)};
            }

        }

        return new int[]{};
    }
}