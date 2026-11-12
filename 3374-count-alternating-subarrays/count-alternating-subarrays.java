class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long total = 1;
        long streak = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                streak++;
            }
            else{
                streak = 1;
            }
            total += streak;
        }
        return total;
    }
}