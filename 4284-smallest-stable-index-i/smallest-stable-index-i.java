class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxPrefix[] = new int[nums.length];
        int minSuffix[]= new int[nums.length];
        maxPrefix[0]=nums[0];
        minSuffix[nums.length-1]=nums[nums.length-1];
        for(int i =1;i<nums.length;i++){
            maxPrefix[i] = Math.max(nums[i],maxPrefix[i-1]); 
        }
        for(int i =nums.length-2;i>=0;i--){
            minSuffix[i] = Math.min(nums[i],minSuffix[i+1]); 
        }
        for (int i=0;i<nums.length;i++) {
            if (maxPrefix[i]-minSuffix[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}