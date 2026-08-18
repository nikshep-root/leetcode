class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        long sum = 0;
        long ans = Long.MIN_VALUE;
        for(int right = 0;right < nums.length;right++){
            sum += nums[right];
            if(right - left+1 > k){
                sum -= nums[left];
                left++;
            }
            if(right - left+1== k){
                ans = Math.max(ans,sum);
            }
        }
        return (double)ans/k;
    }
}