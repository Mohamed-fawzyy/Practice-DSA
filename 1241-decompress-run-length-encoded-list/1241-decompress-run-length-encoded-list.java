class Solution {
    public int[] decompressRLElist(int[] nums) {

        int n = nums.length;
        int len = 0;
        for (int i=0; i < n; i += 2){
            len += nums[i];
        }

        int[] res = new int[len];
        int position = 0;

        for (int i=0; i < n; i += 2){
            Arrays.fill(res, position, position + nums[i], nums[i + 1]);
            position += nums[i];
        }
        return res;
    }
}