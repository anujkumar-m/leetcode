class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        char[][] res = new char[col][row];

        for(char[] f : res) Arrays.fill(f, '.');

        for(int r = 0; r < row; r++){
            int i = col - 1;
            for(int c = col - 1; c >= 0; c--){
                if(grid[r][c] == '#'){
                    res[i][row - r - 1] = '#';
                    i--;
                }
                else if(grid[r][c] == '*'){
                    res[c][row - r - 1] = '*';
                    i = c - 1;
                }
            }
        }
        return res;
    }
}