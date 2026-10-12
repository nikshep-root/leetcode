class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols = encodedText.length()/rows;
        char mat[][] = new char[rows][cols];
        int k =0;
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                mat[i][j] = encodedText.charAt(k);
                k++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<cols;i++){
            int row = 0;
            int col = i;
            while(row < rows && col<cols){
                sb.append(mat[row][col]);
                row++;
                col++;
            }
        }
        return sb.toString().stripTrailing();
    }
}