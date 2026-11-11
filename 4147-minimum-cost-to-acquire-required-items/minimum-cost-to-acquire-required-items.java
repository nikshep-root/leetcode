class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long mini = Math.min(need1,need2);
        long min = Math.min(costBoth,cost1+cost2);
        long ans = mini*min;
        long rem1 = need1-mini;
        long rem2 = need2-mini;
        if(rem1>0){
            ans += (long) Math.min(costBoth,cost1)*rem1;
        }
        if(rem2>0){
            ans += (long) Math.min(costBoth,cost2)*rem2;
        }
        return ans;
    }
}