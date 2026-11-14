class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.size();i++){
            int currSum = 0;
            for(int j =i;j<nums.size();j++){
                currSum += nums.get(j);
                int length = j-i+1;
                if(length >= l && length <= r){
                    if(currSum > 0){
                        min = Math.min(min,currSum);
                    }
                }
                if(length > r){
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}