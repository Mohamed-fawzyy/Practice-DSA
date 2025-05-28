class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n2 = nums2.length;
        int[] ans = new int[n2];

        int n1 = nums1.length;
        int[] res = new int[n1];

        Stack<Integer> stack = new Stack<>();

        for (int i = n2 - 1; i >= 0; i--) {

            if (!stack.isEmpty()) {
                while ( !stack.isEmpty() && nums2[i] >= stack.peek())
                    stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
            System.out.println(ans[i]);
        }

        for (int i=0; i < n1; i++){
            for (int j=0; j < n2; j++){
                if (nums1[i] == nums2[j]){
                    res[i] = ans[j];
                    break;
                }
            }
        }

        return res;
    }
}