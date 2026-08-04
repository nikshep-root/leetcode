class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            set.add(nums[i]);
        }
        for(int i = min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}