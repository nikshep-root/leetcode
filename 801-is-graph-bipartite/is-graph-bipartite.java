class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i =0;i<n;i++){
            color[i] = -1;
        }
        for(int i =0;i<n;i++){
            if(color[i]==-1){
                if(!check(i,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean check(int start, int[][] graph, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbour : graph[node]){
                if(color[neighbour] == -1){
                    color[neighbour] = 1- color[node];
                    q.add(neighbour);
                }
                else if(color[neighbour] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}