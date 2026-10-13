class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] absNums = new long[n];
        for(int i =0;i<nums.length;i++){
            absNums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(absNums);
        int high = nums.length-1;
        int low = 0;
        long score = 0;
        boolean add = true;
        while(high >= low){
            if(add){
                score += absNums[high]*absNums[high];
                high--; 
            }
            else{
                score -= absNums[low]*absNums[low];
                low++;
            }
            add = !add;
        }
        return score;
    }
}