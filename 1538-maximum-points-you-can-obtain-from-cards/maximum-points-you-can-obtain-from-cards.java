class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int size = cardPoints.length-k;
        int left = 0;
        int sum = 0;
        int min= Integer.MAX_VALUE;
        for(int right=0;right<cardPoints.length;right++){
            sum += cardPoints[right];
            if(right-left+1 > size){
                sum -= cardPoints[left];
                left++;
            }
            if(right-left+1 == size){
                min = Math.min(min,sum);
            }
        }
        int total = 0;
        for(int i =0;i<cardPoints.length;i++){
            total += cardPoints[i];
        }
        return total-min;
    }
}