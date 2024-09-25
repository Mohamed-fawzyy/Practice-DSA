class Solution {
    public int[] twoSum(int[] nums, int target) {

        /*
         * bruteforce
         * int n = nums.length;
         * int sum = 0;
         * int[] res = new int[n];
         * 
         * for (int i = 0; i < n; i++) {
         * 
         * for (int j = i + 1; j < n; j++) {
         * 
         * sum = nums[i] + nums[j];
         * if (sum == target) {
         * return new int[] { i, j };
         * }
         * res[i] = i;
         * res[j] = j;
         * }
         * }
         * return res;
         * 
         */

        int n = nums.length;
        int l = 0;
        int r = 1;

        while (l < r && r < n) {

            int sum = nums[l] + nums[r];

            if (sum == target) {
                return new int[] { l, r };
            }

            if (r == n - 1) {
                l++;
                r = l + 1;
                sum = nums[l] + nums[r];
            }

            if (sum != target) {
                r++;
            }
            
        }
        return new int[] { l, r };
    }
}