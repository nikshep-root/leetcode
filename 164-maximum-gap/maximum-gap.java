class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(Math.abs(nums[i] - nums[i+1]) > max){
                max = Math.abs(nums[i] - nums[i+1]);
            }
        }
        return max;
    }
}