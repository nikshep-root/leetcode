class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m][n];
        for(int i = 0;i < m;i++) {
            int sum = 0;
            for(int j = 0;j < n;j++) {
                sum += matrix[i][j];
                pre[i][j] = sum;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for(int startCol = 0;startCol<n;startCol++){
            for(int startRow = 0;startRow<m;startRow++){
                for(int j=startCol;j<n;j++){
                    int sum = 0;
                    for(int row = startRow;row < m;row++){
                        sum += pre[row][j] - (startCol > 0 ? pre[row][startCol - 1] : 0);
                        if(sum <= k)
                            maxSum = Math.max(maxSum, sum);
                        if (maxSum == k)
                            return maxSum;
                    }
                }
            }
        }
        return maxSum;
    }
}