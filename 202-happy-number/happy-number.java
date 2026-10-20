class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int temp = n;
            int sum = 0;
            while(temp!=0){
                int digit = temp%10;
                sum += (digit*digit);
                temp = temp/10;
            }
            n = sum;
        }
        return n==1;
    }
}