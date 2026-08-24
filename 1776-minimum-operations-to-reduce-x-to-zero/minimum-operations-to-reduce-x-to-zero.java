class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int targetSum = totalSum - x;
        if(targetSum < 0) return -1;
        if(targetSum ==0) return nums.length;
        int left = 0;
        int maxLen = -1;
        int currSum = 0;
        for(int right = 0;right < nums.length;right++){
            currSum += nums[right];
            while(currSum > targetSum && left <= right){
                currSum -= nums[left];
                left++;
            }
            if(currSum == targetSum){
                maxLen = Math.max(maxLen,right-left+1);
            }
        }
        return maxLen == -1? -1 : nums.length-maxLen;
    }
}