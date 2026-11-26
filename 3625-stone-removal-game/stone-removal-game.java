class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        int turns = 0;
        while(n >= remove){
            n -= remove;
            remove--;
            turns++;
        }
        return turns%2 == 1;
    }
}