class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        long sum = 0;
        for(int c : candies){
            sum += c;
            high = Math.max(high,c);
        }
        if(sum < k) return 0;
        int res = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canAllocate(candies,k,mid)){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
    private boolean canAllocate(int[] candies,long k,int candyCount){
        long childCount= 0;
        for(int c : candies){
            childCount += c/candyCount;
            if(childCount >= k){
                return true;
            }
        }
        return childCount >= k;
    }
}