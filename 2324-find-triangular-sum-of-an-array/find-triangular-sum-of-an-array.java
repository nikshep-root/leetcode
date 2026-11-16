class Solution {
    public int triangularSum(int[] nums) {
        int[] arr = nums;
        int len = nums.length;
        while(len != 1){
            int temp[] = new int[len-1];
            for(int i =0;i<temp.length;i++){
                temp[i] = (arr[i]+arr[i+1]) % 10;
            }
            arr = temp;
            len--;
        }
        return arr[0];
    }
}