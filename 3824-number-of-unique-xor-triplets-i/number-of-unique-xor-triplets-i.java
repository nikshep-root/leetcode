class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int ans = 1;
        while(ans <= nums.length){
            ans <<= 1;
        }
        return ans;
    }
}