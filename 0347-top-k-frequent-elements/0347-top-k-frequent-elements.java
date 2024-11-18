class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int index = 0;
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] buckets = new int[k];

        for (int number : nums) {

            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (int i = n; i > 0; i--) {

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                int val = entry.getValue();
                int key = entry.getKey();

                if (val == i) {

                    if (index < k) {

                        buckets[index] = key;
                        index++;
                    } else {
                        break;
                    }
                }
            }

        }

        return buckets;
    }
}