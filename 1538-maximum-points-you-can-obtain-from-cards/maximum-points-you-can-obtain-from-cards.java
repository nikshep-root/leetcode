class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;
        int totalPoints = 0;
        for(int p : cardPoints){
            totalPoints += p;
        }
        for(int right = 0;right < cardPoints.length;right++){
            sum += cardPoints[right];
            if(right - left+1 > cardPoints.length-k){
                sum -= cardPoints[left];
                left++;
            }
            if(right - left+1 == cardPoints.length-k){
                min = Math.min(min,sum);
            }
        }
        return totalPoints-min;
    }
}