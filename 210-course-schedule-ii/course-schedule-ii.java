class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i =0;i<numCourses;i++){
            adj.add((new ArrayList<>()));
        }
        for(int[] pre : prerequisites){
            int course = pre[0];
            int prerequisite = pre[1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<numCourses;i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int[] res = new int[numCourses];
        int index= 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            res[index++]=current;
            for(int neigh : adj.get(current)){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    queue.offer(neigh);
                }
            }
        }
        if(index == numCourses){
            return res;
        }
        return new int[0];
    }
}