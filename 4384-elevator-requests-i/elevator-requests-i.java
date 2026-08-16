class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = requests[0];
        for(int i =1;i<requests.length;i++){
            if(requests[i]<=n){
                ans += Math.abs(requests[i]-requests[i-1]);
            }
        }
        return ans;
    }
}