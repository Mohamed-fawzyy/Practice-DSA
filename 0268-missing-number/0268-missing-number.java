class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int formula = n*(n+1) / 2;
        int res = 0;

        System.out.println(formula);

        for (int number : nums){
            
            res = formula - number;
            formula = res;
        }
        return res;
    }
}