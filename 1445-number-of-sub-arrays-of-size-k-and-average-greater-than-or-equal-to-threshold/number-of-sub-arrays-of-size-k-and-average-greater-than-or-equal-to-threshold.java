class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int left = 0;
        int count = 0;
        for(int right = 0;right < arr.length;right++){
            sum += arr[right];
            if(right - left+1 > k){
                sum -= arr[left];
                left++;
            }
            if(right - left+1 == k){
                int avg = sum/k;
                if(avg >= threshold){
                    count++;
                }
            }
        }
        return count;
    }
}