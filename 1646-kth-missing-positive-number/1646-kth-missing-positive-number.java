// class Solution {
//     public int findKthPositive(int[] arr, int k) {

//         int index = 0;
//         int missCount = 0;
//         int current = 1;

//         while (missCount < k) {
//             if (index < arr.length && arr[index] == current) {
//                 index++;
//             }else{
//                 missCount++;
//                 if (missCount == k){
//                     return current;
//                 }
//             }
//             current++;
//         }

//     return current + (k - missCount);
//     }
// }
/*              THE PREV CODE IS O(n) */


class Solution {
    public int findKthPositive(int[] arr, int k) {

        int left = 0;
      int right = arr.length;

      while(left<right) {
        int mid = left + (right-left)/2;
        if(arr[mid]-mid-1<k) {
            left = mid+1;
        } else {
            right = mid;
        }
      }  
      return left + k;
    }
}