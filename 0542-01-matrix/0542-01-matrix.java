class Pair {
    int row;
    int col;

    Pair(int _row, int _col) {
        this.row = _row;
        this.col = _col;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] res = new int[row][col];

        for (int[] n : res)
            Arrays.fill(n, -1);

        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new Pair(i, j));
                    res[i][j] = 0;
                }
            }
        }
        int[] rowDir = { -1, 0, 1, 0 };
        int[] colDir = { 0, 1, 0, -1 };
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newRow = curr.row + rowDir[i];
                int newCol = curr.col + colDir[i];
                if (newRow < row && newRow >= 0 && newCol < col
                        && newCol >= 0 && res[newRow][newCol] == -1) {
                    res[newRow][newCol] = 1 + res[curr.row][curr.col];
                    queue.offer(new Pair(newRow, newCol));
                }
            }
        }
        return res;

    }
}