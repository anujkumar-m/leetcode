class Solution {
    public int numSpecial(int[][] mat) {
        int specialCount = 0;
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    if (check(mat,i,j))
                        specialCount++;
                }
            }
        }
        return specialCount;
    }

    public boolean check(int[][] mat, int row, int col) {
        for (int i = 0; i < mat.length; i++) {
            if (i != row && mat[i][col] == 1)
                return false;
        }
        for (int i = 0; i < mat[0].length; i++) {
            if (i != col && mat[row][i] == 1)
                return false;
        }
        return true;
    }
}