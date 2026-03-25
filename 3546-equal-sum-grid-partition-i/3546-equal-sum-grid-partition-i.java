class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        long[] rowSum = new long[row];
        long[] colSum = new long[col];
        long tot = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
                tot += grid[i][j];
            }
        }

        if(tot % 2 != 0) return false;
        if(checkSum(rowSum, tot)) return true;
        if(checkSum(colSum, tot)) return true;
        return false;

    }

    public boolean checkSum(long[] arr,long tot){
        long left = arr[0];
        long right = tot - left;

        for(int i = 1; i < arr.length; i++){
            if(left == right) return true;
            if(left > right) return false;
            left += arr[i];
            right -= arr[i];
        }
        return false;
    }
}