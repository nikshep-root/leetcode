class Solution {
    public int countGoodRotations(int[] nums) {
        int arr[] = new int[nums.length*2];
        for(int i =0;i<nums.length;i++){
            arr[i] = nums[i];
            arr[nums.length+i] = nums[i];
        }
        long totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        int left = 0;
        long currSum = 0;
        int count = 0;
        for(int right = 0;right < arr.length;right++){
            currSum += arr[right];
            if(right - left +1 > nums.length/2){
                currSum -= arr[left];
                left++;
            }
            if(right - left +1 == nums.length/2 && left < nums.length){
                if(currSum*2L > totalSum){
                    count++;
                }
            }
        }
        return count;
    }
}