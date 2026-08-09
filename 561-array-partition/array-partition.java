class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i+=2){
            if(nums[i] < nums[i-1]){
                ans+=nums[i];
            }
            else{
                ans+=nums[i-1];
            }
        }
        return ans;
    }
}