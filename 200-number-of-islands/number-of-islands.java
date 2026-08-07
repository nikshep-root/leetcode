class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int vis[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(vis[i][j] == 0 && grid[i][j] == '1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }

    private void bfs(int row, int col,int[][] vis, char[][] grid){
        vis[row][col] = 1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;

        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        while(!queue.isEmpty()){
            int ro = queue.peek().first;
            int co = queue.peek().second;
            queue.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = ro + delRow[i];
                int ncol = co + delCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m 
                        && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    queue.add(new Pair(nrow, ncol));
                }
            }
        }
    }
}