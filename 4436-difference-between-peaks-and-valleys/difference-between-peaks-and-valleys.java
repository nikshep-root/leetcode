class Solution {
    public int peakValleyDifference(int[] nums) {
        int peekSum = 0;
        int vallySum = 0;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) peekSum += nums[i];
            else if(nums[i] < nums[i-1] && nums[i] < nums[i+1]) vallySum += nums[i];
        }
        return peekSum - vallySum;
    }
}