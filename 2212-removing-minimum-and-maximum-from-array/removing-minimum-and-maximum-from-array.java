class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1) return 1;
        int minIdx = 0;
        int maxIdx = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
            if(nums[i] < nums[minIdx]){
                minIdx = i;
            }
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        int delFront = right + 1;
        int delBack = nums.length-left;
        int delBoth = (left + 1) + (nums.length - right);
        return Math.min(delFront,Math.min(delBack, delBoth));
    }
}