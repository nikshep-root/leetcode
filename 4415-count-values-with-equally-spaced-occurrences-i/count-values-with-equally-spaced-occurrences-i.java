class Solution {
    public int countSpecialIntegers(int[] nums) {
        int freq[] = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int res = 0;
        for(int i =1;i<=100;i++){
            if(freq[i] == 3){
                int first= -1;
                int second= -1;
                int third = -1;
                for(int j =0;j<nums.length;j++){
                    if(nums[j] == i){
                        if(first == -1){
                            first = j;
                        }
                        else if(second == -1){
                            second = j;
                        }
                        else{
                            third = j;
                            break;
                        }
                    }
                }
                if(second-first == third-second){
                    res++;
                }
            }
        }
        return res;
    }
}