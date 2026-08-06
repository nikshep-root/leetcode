class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;i<=n+10;i++){
            int temp = i;
            int mul = 1;
            while(temp != 0){
                int digit = temp%10;
                mul *= digit;
                temp = temp/ 10;
            }
            if((mul % t) == 0){
                return i;
            }
        }
        return -1;
    }
}