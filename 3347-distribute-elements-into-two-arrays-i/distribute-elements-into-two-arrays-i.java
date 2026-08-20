class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        int j = 0;
        int k = 0;
        for(int i =2;i<nums.length;i++){
            if(list1.get(j) > list2.get(k)){
                list1.add(nums[i]);
                j++;
            }
            else{
                list2.add(nums[i]);
                k++;
            }
        } 
        int[] ans = new int[nums.length];
        int i =0;
        while(i < list1.size()){
            ans[i] = list1.get(i);
            i++;
        }
        i =0;
        while(i < list2.size()){
            ans[list1.size()+i] = list2.get(i);
            i++;
        }
        return ans;
    }
}