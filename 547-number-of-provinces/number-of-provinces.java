class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjLis = new ArrayList<>();
        int V = isConnected.length;
        for(int i = 0;i<V;i++){
            adjLis.add(new ArrayList<>());
        }
        for(int i = 0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j] == 1 && i != j){
                    adjLis.get(i).add(j);
                    adjLis.get(j).add(i);
                }
            }
        }
        int vis[] = new int[V];
        int count = 0;
        for(int i =0;i<V;i++){
            if(vis[i] == 0){
                count++;
                dfs(i,adjLis,vis);
            }
        }
        return count;
    }
    private void dfs(int node,ArrayList<ArrayList<Integer>> adjLis,int[] vis){
        vis[node] = 1;
        for(int nodes : adjLis.get(node)){
            if(vis[nodes] == 0){
                dfs(nodes,adjLis,vis);
            }
        }
    }
}