class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int try1 = nums[nums.length-1]-nums[2];
        int try2 = nums[nums.length-3]-nums[0];
        int try3 = nums[nums.length-2]-nums[1];
        return Math.min(try1,Math.min(try2,try3));
    }
}