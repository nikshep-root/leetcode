class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i =0;
        int j =0;
        while(true){
            char dir = grid[i][j];
            grid[i][j] = 'V';
            if(dir == 'R'){
                if(j+1>=n || grid[i][j+1] == 'V') break;
                j++;
            }
            else if(dir == 'L'){
                if(j-1<0 || grid[i][j-1] == 'V') break;
                j--; 
            }
            else if(dir == 'U'){
                if(i-1<0 || grid[i-1][j] == 'V') break;
                i--;
            }
            else{
                if(i+1>=m || grid[i+1][j] == 'V') break;
                i++;
            }
        }
        int[] ans = new int[2];
        ans[0] = i;
        ans[1] = j;
        return ans;
    }
}