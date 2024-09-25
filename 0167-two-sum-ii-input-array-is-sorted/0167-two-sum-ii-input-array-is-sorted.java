class Solution {
    public int[] twoSum(int[] nums, int target) {
        // two pointer tech

        int p1 = 0;
        int p2 = nums.length - 1;

        while (p1 < p2) {
            int sum = nums[p1] + nums[p2];

            if (sum == target) {
                return new int[]{p1 + 1, p2 + 1};
            } else if (target < sum) {
                p2 -= 1;
            } else {
                p1 += 1;
            }
        }
        return new int[]{p1 + 1, p2 + 1};
    }
}