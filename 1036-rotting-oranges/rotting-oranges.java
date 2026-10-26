class Pair{
    int first;
    int second;
    public Pair(int a,int b){
        this.first = a;
        this.second = b;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n =grid.length;
        int m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int freshCnt=0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j));
                }
                else if(grid[i][j] == 1){
                    freshCnt++;
                }
            }
        }
        if(freshCnt == 0) return 0;
        int mins = 0;
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean roottedThisMin = false;
            for(int s =0;s<size;s++){
                Pair curr = queue.poll();
                int ro = curr.first;
                int co = curr.second;
                for(int i =0;i<4;i++){
                    int nrow = ro+delRow[i];
                    int ncol = co+delCol[i];
                    if(nrow >= 0 && nrow <n && ncol>=0 && ncol<m && grid[nrow][ncol] == 1){
                        grid[nrow][ncol] = 2;
                        queue.add(new Pair(nrow,ncol));
                        freshCnt--;
                        roottedThisMin = true;
                    }
                }
            }
            if(roottedThisMin) mins++;
        }
        return freshCnt == 0? mins : -1;
    }
}