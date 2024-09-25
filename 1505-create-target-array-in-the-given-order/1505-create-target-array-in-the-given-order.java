// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {

//         int n = nums.length;
//         int[] target = new int[n];

//         Arrays.fill(target, -1);

//         for (int i = 0; i < n; i++) {

//             // for shifting elements to right
//             for (int j = target.length - 1; j > index[i]; j--) {

//                 if (target[index[i]] != -1) {
//                     target[j] = target[j - 1];
//                 }
//             }
//             target[index[i]] = nums[i];

//         }

//         return target;
//     }
// }

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> array = new ArrayList<>();
        int n = nums.length;

        for (int i=0; i < n; i++){
            array.add(index[i], nums[i]);
        }
        
        int[] res = new int[n];
        for(int j=0; j < array.size(); j++){
            res[j] = array.get(j);
        }
        return res;
    }
}