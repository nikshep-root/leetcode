class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> basket = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int right =0;right<fruits.length;right++){
            basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++; 
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}