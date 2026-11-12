class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int maxInc = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                inc++;
            }
            else{
                inc = 1;
            }
            maxInc = Math.max(inc,maxInc);
        }
        int dec = 1;
        int maxDec = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                dec++;
            }
            else{
                dec = 1;
            }
            maxDec = Math.max(maxDec,dec);
        }
        return maxDec > maxInc? maxDec : maxInc;
    }
}