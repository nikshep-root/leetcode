class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        Arrays.sort(nums);
        int j =0;
        for(int i = min;i<=max;i++){
            if(j < nums.length && nums[j] == i){
                j++;
            }
            else{
                list.add(i);
            }
        }
        return list;
    }
}