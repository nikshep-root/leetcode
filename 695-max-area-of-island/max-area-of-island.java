class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int maxSum = 0;
        for(int row = 0;row < r;row++){
            for(int col = 0;col<c;col++){
                if(grid[row][col] == 1){
                    int sum = bfs(grid,row,col,r,c);
                    maxSum = Math.max(maxSum,sum);
                }
            }
        }
        return maxSum;
    }
    private int bfs(int[][] grid,int row,int col,int r,int c){
        int sum = 1;
        grid[row][col] = 0;
        int[] rdiff = {-1,1,0,0};
        int[] cdiff = {0,0,-1,1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int[] pair = q.poll();
            row = pair[0];
            col = pair[1];
            for(int i =0;i<4;i++){
                int ar = row+rdiff[i];
                int ac = col+cdiff[i];
                if(ar>=0 && ar<r && ac>=0 && ac<c && grid[ar][ac]!=0){
                    grid[ar][ac] = 0;
                    q.add(new int[]{ar,ac});
                    sum++;
                }
            }
        }
        return sum;
    }
}