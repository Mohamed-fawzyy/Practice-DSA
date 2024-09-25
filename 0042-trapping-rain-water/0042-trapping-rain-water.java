class Solution {
    public int trap(int[] height) {
        
        int n = height.length, filling = 0;
        int l=0, r = n - 1;
        int maxL = 0, maxR = 0;

        while (l < r){
            maxL = Math.max(maxL, height[l]);
            maxR = Math.max(maxR, height[r]);

            if (height[l] <= height[r]) {
                filling += maxL - height[l];
                l++;
            } else {
                filling += maxR - height[r];
                r--;
            }
        }
        return filling;
    }
}