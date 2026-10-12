class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows*cols];
        int r =0;
        int c =0;
        for(int i =0;i<res.length;i++){
            res[i] = mat[r][c];
            if((r+c)%2 == 0){
                if(c == cols-1) r++;
                else if(r == 0) c++;
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == rows-1) c++;
                else if(c == 0) r++;
                else{
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}