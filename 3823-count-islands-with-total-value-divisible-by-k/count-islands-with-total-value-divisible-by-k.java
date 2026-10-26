class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(vis[i][j] == 0 && grid[i][j] > 0){
                    long islandSum = bfs(i,j,vis,grid,k);
                    if(islandSum % k == 0) count++;
                }
            }
        }
        return count;
    }
    private long bfs(int row,int col,int[][] vis,int[][] grid,int k){
        vis[row][col] = 1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        long sum = 0;
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            int ro = curr.first;
            int co = curr.second;
            sum += grid[ro][co];
            for(int i =0;i<4;i++){
                int nrow = ro+delRow[i];
                int ncol = co+delCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 & ncol<m && grid[nrow][ncol]>0 && vis[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    queue.add(new Pair(nrow,ncol));
                }
            }
        }
        return sum;
    }
}