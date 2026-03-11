class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    int[] rDir = { -1, 0, 1, 0 };
    int[] cDir = { 0, 1, 0, -1 };

    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    q.offer(new Pair(i, j, 0));
            }
        }

        int maxTime = 0;
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int newRow = rDir[i] + curr.row;
                int newCol = cDir[i] + curr.col;

                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length &&
                        grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2;
                    q.offer(new Pair(newRow, newCol, curr.time + 1));
                    maxTime = Math.max(curr.time + 1, maxTime);
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    return -1;
            }
        }
        return maxTime;
    }
}