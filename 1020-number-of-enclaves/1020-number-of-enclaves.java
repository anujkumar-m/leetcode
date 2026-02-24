class Solution {
    public int numEnclaves(int[][] grid) {
        int claves = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0 ; i< row ;i++){
            for(int j = 0 ;j < col ; j++){
                if(i == 0 || j == 0 || i == row-1 || j == col - 1)
                    dfs(grid,i,j,row,col);
            }
        }

        for(int[] arr : grid){
            for(int n : arr){
                if(n == 1) claves++;
            }
        }
        return claves;
    }


    public void dfs(int[][] grid, int i ,int j, int row, int col){
        if(i<0 || j < 0 || i >= row-1 || j >=col-1 || grid[i][j] == 0) return;

        grid[i][j] = 0;

        dfs(grid,i,j-1,row,col);
        dfs(grid,i-1,j,row,col);
        dfs(grid,i,j+1,row,col);
        dfs(grid,i+1,j,row,col);
    }
}