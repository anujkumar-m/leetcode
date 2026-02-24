class Solution {
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        boolean vis[][] = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    int area = bfs(grid, i, j, vis);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public int bfs(int[][] grid, int row, int col, boolean[][] vis) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        vis[row][col] = true;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(row, col));
        int area = 1;

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();

            int[] rowDir = { -1, 0, 1, 0 };
            int[] colDir = { 0, 1, 0, -1 };
            for (int i = 0; i < 4; i++) {
                int newRow = curr.row + rowDir[i];
                int newCol = curr.col + colDir[i];
                if (newRow >= 0 && newCol >= 0 && newRow <= rowSize - 1 && newCol <= colSize - 1
                        && grid[newRow][newCol] == 1 &&
                        !vis[newRow][newCol]) {
                    vis[newRow][newCol] = true;
                    queue.offer(new Pair(newRow, newCol));
                    area++;
                }
            }
        }
        return area;
    }
}
