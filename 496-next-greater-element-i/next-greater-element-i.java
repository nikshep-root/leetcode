class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            boolean start = false;
            for(int j =0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]) start = true;
                if(start && nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }
}