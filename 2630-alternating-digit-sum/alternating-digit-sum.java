class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0){
            int digit = n % 10;
            list.add(digit);
            n = n/10;
        }
        boolean plus = true;
        int ans =0;
        for(int i = list.size()-1;i>=0;i--){
            if(plus){
                ans += list.get(i);
                plus = false;
            }
            else{
                ans -= list.get(i);
                plus = true;
            }
        }
        return ans;
    }
}