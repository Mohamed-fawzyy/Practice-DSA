class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        if (n == 1)
            return new int[] { nums[0] };

        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;
        int[] bucket = new int[k];

        // map insertion
        for (int i = 0; i < n; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        for (int i = n; i >= 0; i--) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){

                if (i == entry.getValue()){

                    if (index < k){

                        bucket[index] = entry.getKey();
                        index++;
                    }
                    else if (index == k) break;
                }
            }
        }

        return bucket;
    }
}