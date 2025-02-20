class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int formula = n*(n+1) / 2;

        System.out.println(formula);

        for (int number : nums){
            
            formula -= number;
        }
        return formula;
    }
}