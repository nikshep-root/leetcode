class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] badPairs= new int[nums.length];
        for(int i =1;i<nums.length;i++){
            badPairs[i] = badPairs[i-1];
            if(nums[i] % 2 == nums[i-1] % 2) badPairs[i]++;
        }
        boolean[] ans = new boolean[queries.length];
        for(int i =0;i<queries.length;i++){
            int start = queries[i][0];
            int stop = queries[i][1];
            ans[i] = (badPairs[stop]-badPairs[start] == 0);
        }
        return ans;
    }
}