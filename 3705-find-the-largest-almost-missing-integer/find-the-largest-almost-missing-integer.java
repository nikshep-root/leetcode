class Solution {
    public int largestInteger(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if(k == 1){
            int ans = -1;
            for(int num : nums){
                if (map.get(num)==1 && num>ans) {
                    ans = num;
                }
            }
            return ans;
        }
        else if(k == nums.length){
            return max;
        }
        else{
            int first = nums[0];
            int last = nums[nums.length - 1];
            boolean firstUnique = map.get(first) == 1;
            boolean lastUnique = map.get(last) == 1;
            if (firstUnique && lastUnique) {
                return Math.max(first, last);
            } 
            else if(firstUnique) {
                return first;
            } 
            else if(lastUnique) {
                return last;
            } 
            else{
                return -1;
            }
        }
    }
}