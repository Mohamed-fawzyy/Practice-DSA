class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int l = arr.length;
        int sum = 0;
        int occ = 0;

        /*
        the formla of applying subarray is [i+1 * l-i]
        and if you want to take only the odd length /2 and ciel it
        after that u need to sum all of this sub and that by * arr[i]
        */      

        for (int i=0; i < l; i++) {
            occ = (int) Math.round(((i + 1) * (l - i)) / 2.0);
            sum += (occ * arr[i]);
        }

        return sum;
    }
}