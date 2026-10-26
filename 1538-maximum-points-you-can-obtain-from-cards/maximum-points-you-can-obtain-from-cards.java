class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currScore = 0;
        for(int i =0;i<k;i++){
            currScore += cardPoints[i];
        }
        int maxScore = currScore;
        for(int i =0;i<k;i++){
            currScore -= cardPoints[k-1-i];
            currScore += cardPoints[n-1-i];
            maxScore = Math.max(maxScore,currScore);
        }
        return maxScore;
    }
}