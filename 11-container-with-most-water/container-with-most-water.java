class Solution {
    public int maxArea(int[] height) {
        int maxi = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){ 
            if(height[left]>height[right]){
                int area = (right-left) * height[right];
                maxi = Math.max(maxi,area);
                right--;
            }
            else{
                int area = (right-left) * height[left];
                maxi = Math.max(maxi,area);
                left++;
            }
        }
        return maxi;
    }
}