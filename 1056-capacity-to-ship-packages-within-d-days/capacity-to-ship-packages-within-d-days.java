class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<weights.length;i++){
            sum+=weights[i];
            max = Math.max(max,weights[i]);
        }
        int low = max;
        int high = sum;
        while(low < high){
            int mid = low+(high-low)/2;
            if(canShip(weights,days,mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    private boolean canShip(int[] weights,int days,int capacity){
        int requiredDays = 1;
        int currentWeight = 0;
        for(int weight : weights){
            if(currentWeight + weight > capacity){
                requiredDays++;
                currentWeight =0;
            }
            currentWeight += weight;
        }
        return requiredDays <= days;
    }
}