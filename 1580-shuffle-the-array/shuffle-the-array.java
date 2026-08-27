class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int ptr1 = 0;
        int ptr2 = n;
        for(int i =0;i<nums.length;i++){
            if(i % 2 == 0){
                ans[i] = nums[ptr1];
                ptr1++; 
            }
            else{
                ans[i] = nums[ptr2];
                ptr2++;
            }
        }
        return ans;
    }
}