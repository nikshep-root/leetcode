class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n]; 
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int communicatingServers = 0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    if(rowCount[i] > 1 || colCount[j] > 1){
                        communicatingServers++;
                    }
                }
            }
        }
        return communicatingServers;
    }
}