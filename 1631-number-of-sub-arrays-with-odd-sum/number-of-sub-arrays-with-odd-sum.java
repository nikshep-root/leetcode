class Solution {
    public int numOfSubarrays(int[] arr) {
        int oddCount = 0;
        int evenCount = 1;
        int currSum = 0;
        int totalSubarrays = 0;
        int MOD =(int) 1e9 + 7;
        for(int num : arr){
            currSum += num;
            if(currSum % 2 == 1){
                oddCount++;
                totalSubarrays = (totalSubarrays+evenCount) % MOD;
            }
            else{
                evenCount++;
                totalSubarrays =  (totalSubarrays+oddCount) % MOD;
            }
        }
        return totalSubarrays;
    }
}