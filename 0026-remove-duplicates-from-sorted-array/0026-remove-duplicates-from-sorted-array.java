class Solution {
    public int removeDuplicates(int[] nums) {

        int l = 0;
        int r = 1;
        int i = 0;

        int n = nums.length;

        int[] arr = new int[n];

        while (r < n) {

            if (nums[l] != nums[r]) {
                arr[i] = nums[l];
                l = r;
                i++;
            }
            r++;
        }
        arr[i] = nums[l];

        for (int j = 0; j < arr.length; j++) {
            nums[j] = arr[j];
        }

        return ++i;
    }
}