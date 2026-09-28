class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int q : quantities){
            high = Math.max(high,q);
        }
        int res =high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canDistribute(n,quantities,mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    private boolean canDistribute(int n,int[] quantities,int k){
        int storesNeeded = 0;
        for(int q : quantities){
            storesNeeded += (q+k-1)/k;
            if(storesNeeded > n){
                return false;
            }
        }
        return storesNeeded<=n;
    }
}