class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int left  =0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] < minK || nums[right] > maxK) left = right+1;
            else count += right-left+1;
        }
        return count;
    }
}