class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n < 3)
            return n;

        int l = 0, r = 1, c = 0;

        while (r < n) {
            if (nums[l] != nums[r]) {
                // l++;
                nums[++l] = nums[r];
                c = 0;
            } else if (nums[l] == nums[r] && c < 1) {
                c++;
                nums[++l] = nums[r];
            }
            r++;
        }

        return l + 1;
    }
}