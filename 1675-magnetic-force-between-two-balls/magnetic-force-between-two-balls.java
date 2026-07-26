class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0;
        int high = position[position.length-1] - position[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            boolean can = is_achievable(mid,position,m);
            if(can){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
    private boolean is_achievable(int mid, int[] position,int m){
        int count = 1;
        int last_position = position[0];
        for(int i =1;i<position.length;i++){
            if(position[i]-last_position >= mid){
                count++;
                last_position = position[i];
            }
            if(count >= m){
               return true;
            }
        }   
        return false;
    }
}