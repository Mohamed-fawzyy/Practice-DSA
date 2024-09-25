class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length, gap = 10000, ans = 0;
        Arrays.sort(nums);

        if (n <= 3)
            return Arrays.stream(nums).sum();

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) return target;
                else if (sum < target) l++;
                else r--;

                int currGap = Math.abs(sum - target);
                if (currGap < gap) {
                    gap = currGap;
                    ans = sum; 
                }
            }
        }
        return ans;
    }
}