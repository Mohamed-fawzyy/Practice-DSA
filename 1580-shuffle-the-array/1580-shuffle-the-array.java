class Solution {
    public int[] shuffle(int[] nums, int n) {

        int len = nums.length;
        int l = 0, r = n;

        int[] arr = new int[n * 2];
        // List<Integer> res = new ArrayList<>();

        // while (l < r && r < len) {
        //     res.add(nums[l]);
        //     l++;
        //     res.add(nums[r]);
        //     r++;
        // }

        // for (int i=0; i < res.size(); i++){
        // arr[i] = res.get(i);
        // }

        for (int i = 0; i < len; i++) {

            if (r < len) {
                arr[i] = nums[l];
                l++;
                arr[++i] = nums[r];
                r++;
            }

        }

        return arr;
    }
}