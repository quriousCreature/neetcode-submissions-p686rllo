class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length-1;
        int sum = 0;

        for(int i = 0; i <= len; i++) {

            for(int j=0; j<=len; j++) {

                if(i==j) sum += mat[i][j];
                if((i+j)==len) sum += mat[i][j];

                if( i==j  && (i+j)==len ) sum -= mat[i][j];
            }
        }

        return sum;
        
    }
}