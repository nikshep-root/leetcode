class Solution {
    public long maxSum(List<Integer> num, int m, int k) {
        int nums[] = new int[num.size()];
        for(int i =0;i<nums.length;i++){
            nums[i] = num.get(i);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        long sum = 0;
        long max = 0;
        for(int right=0;right<nums.length;right++){
            sum += nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0) + 1);
            if(right-left+1 > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                sum-=nums[left];
                left++;
            }
            if(right-left+1 == k){
                if(map.size() >= m){
                    max = Math.max(max,sum);
                }
            }
        }
        return max;
    }
}