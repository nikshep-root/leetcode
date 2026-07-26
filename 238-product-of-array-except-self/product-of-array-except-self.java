class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        int pro1 = 1;
        int pro2 = 1;
        dp1[0] = pro1;
        dp2[nums.length-1] = pro2;
        for(int i =1;i<nums.length;i++){
            pro1 *= nums[i-1];
            dp1[i] = pro1;
        }
        for(int i =nums.length-2;i>=0;i--){
            pro2 *= nums[i+1];
            dp2[i] = pro2;
        }
        int ans[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            int pro = dp1[i]*dp2[i];
            ans[i] = pro;
        }
        return ans;
    }
}