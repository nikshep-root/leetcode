class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] results = new int[nums.length-k+1];
        int streak = 1;
        for(int i =0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1] +1){
                streak++;
            }
            else if(i>0){
                streak =1;
            }
            if(i >= k-1){
                if(streak >= k){
                    results[i-k+1] = nums[i];
                }
                else{
                    results[i-k+1] = -1;
                }
            }
        }
        return results;
    }
}