class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        int count = 0;
        while(!queue.isEmpty()){
            int current = queue.poll();
            count++;
            for(int neigh : adj.get(current)){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    queue.offer(neigh);
                }
            }
        }
        return count == numCourses;
    }
}