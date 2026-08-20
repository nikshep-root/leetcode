class Solution {
    public int minimumCardPickup(int[] cards) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int min= Integer.MAX_VALUE;
        for(int right = 0;right<cards.length;right++){
            while(set.contains(cards[right])){
                min = Math.min(min,right-left+1);
                set.remove(cards[left]);
                left++;
            }
            set.add(cards[right]);
        }
        return min == Integer.MAX_VALUE? -1:min;
    }
}