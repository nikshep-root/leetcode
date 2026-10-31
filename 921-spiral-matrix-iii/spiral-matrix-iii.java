class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int[][] ans = new int[rows*cols][2];
        int r = rStart, c = cStart;
        int count = 0;
        ans[count++] = new int[]{r,c};
        int len = 0;
        int d = 0;
        while(count<rows*cols){
            if(d==0 || d==2){
                len++;
            }
            for(int i=0;i<len;i++){
                r += dirs[d][0];
                c += dirs[d][1];
                if(r>=0 && r<rows && c>=0 && c<cols){
                    ans[count++] = new int[]{r,c};
                }
            }
            d = (d+1)%4;
        }
        return ans;
    }
}