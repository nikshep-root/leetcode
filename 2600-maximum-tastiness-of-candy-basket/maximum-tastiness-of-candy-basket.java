class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = 0;
        int high = price[price.length-1] - price[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            boolean can = can_achieve_gap(mid,price,k);
            if(can){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    private boolean can_achieve_gap(int mid,int[] price,int k){
        int count = 1;
        int last_price = price[0];
        for(int i = 1;i<price.length;i++){
            if(price[i]-last_price >= mid){
                count++;
                last_price = price[i];
            }
            if(count >=k){
                return true;
            }
        }
        return false;
    }
}