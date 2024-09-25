class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n <= 1) return n;

        int l = 0;
        int r = 1;

        while (r < n){
            if (nums[l] != nums[r]){
                l++;
                nums[l] = nums[r];
            }
            r++;
        }
        return l + 1;
    }
}
