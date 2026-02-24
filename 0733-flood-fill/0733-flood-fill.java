class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int srcColor = image[sr][sc];
        if (srcColor == color) return image;
        dfs(image, sr, sc, color,srcColor);
        return image;
    }
    public void dfs(int[][] grid,int row, int col,int color, int srcColor){
        if(row<0 || col < 0 || row>=grid.length || col >= grid[0].length || grid[row][col] != srcColor) return;

        grid[row][col] = color;
        dfs(grid,row,col-1,color,srcColor);
        dfs(grid,row-1,col,color,srcColor);
        dfs(grid,row,col+1,color,srcColor);
        dfs(grid,row+1,col,color,srcColor);
    }
}