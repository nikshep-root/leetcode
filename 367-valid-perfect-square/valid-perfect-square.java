class Solution {
    public boolean isPerfectSquare(int num) {
        long dig = 1;
        while(dig <= num){
            if((dig*dig) == num) return true;
            else dig++;
        }
        return false;
    }
}