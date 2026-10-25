class Solution {
    public int calculateScore(int a, int b) {
        int setBitsA = Integer.bitCount(a);
        int setBitsB = Integer.bitCount(b);
        if(setBitsA >= setBitsB){
            return setBitsA*setBitsB;
        }
        return setBitsB/setBitsA;
    }
}