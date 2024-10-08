class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;

        if (n < 3) return output;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    output.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r --;
                } else if (sum < 0)
                    l ++;
                else
                    r --;
            }

        }
        return output;
    }
}