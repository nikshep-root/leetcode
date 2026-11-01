class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i+=2){
            String s = String.valueOf(nums[i]) + String.valueOf(nums[i+1]);
            min = Math.min(min,Integer.parseInt(s));
        }
        return min;
    }
}