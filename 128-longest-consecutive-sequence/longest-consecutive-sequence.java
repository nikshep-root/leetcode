class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum +1)){
                    currentNum++;
                    currentStreak++;
                }
                maxLength = Math.max(maxLength,currentStreak);
            }
        }
        return maxLength;
    }
}