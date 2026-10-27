class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        StringBuilder topRow = new StringBuilder();
        for(int j =0;j<n;j++){
            topRow.append('.');
        }
        ans[0] = topRow.toString();
        for(int i=1;i<m;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n-1;j++) {
                sb.append('#');
            }
            sb.append('.');
            ans[i] = sb.toString();
        }
        return ans;
    }
}