class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int low = 0;
        int high = nums.length-1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                ans[low++] = nums[i];
            }
            else{
                ans[high--] = nums[i];
            }
        }
        return ans;
    }
}