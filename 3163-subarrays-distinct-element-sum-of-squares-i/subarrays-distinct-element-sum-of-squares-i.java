class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for(int i =0;i<nums.size();i++){
            for(int j =i;j<nums.size();j++){
                Set<Integer> set = new HashSet<>();
                for(int k =i;k<=j;k++){
                    set.add(nums.get(k));
                }
                ans += (set.size()*set.size());
            }
        }
        return ans;
    }
}