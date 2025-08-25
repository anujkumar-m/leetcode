class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length-1;
        int row=0,col=n;
        while(col>=0 && row<m){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) ++row;
            else --col;
        }
        return false;

    }
}