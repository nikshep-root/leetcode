class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer>  stack = new Stack<>();
       for(int i =0;i<asteroids.length;i++){
            while(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                int top = stack.peek();
                int collide = top + asteroids[i];
                if(collide<0){
                    stack.pop();

                }
                else if(collide>0){
                    asteroids[i] = 0;
                    break;
                }
                else{
                    asteroids[i] = 0;
                    stack.pop();
                    break;
                }
            }
            if(asteroids[i] != 0){
                stack.push(asteroids[i]);
            }
       }
        int[] ans = new int[stack.size()];
        for(int i =stack.size()-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}