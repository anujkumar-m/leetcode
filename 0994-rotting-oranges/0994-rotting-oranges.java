class Pair {
    int row;
    int col;
    int time;

    Pair(int _row, int _col, int _time) {
        this.row = _row;
        this.col = _col;
        this.time = _time;
    }
}

class Solution {
    private int rowDir[]= {-1, 0, 1, 0};
    private int colDir[] = {0, 1, 0, -1};

    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                }
            }
        }

        int maxTime = 0;
        while(!queue.isEmpty()){
            Pair curr= queue.poll();
            for(int i = 0; i< 4 ;i++){
                int newRow = curr.row + rowDir[i];
                int newCol = curr.col + colDir[i];
                if(newRow>= 0 && newCol>=0 && newRow < grid.length &&
                    newCol < grid[0].length && grid[newRow][newCol] == 1){
                        grid[newRow][newCol]=2;
                        queue.offer(new Pair(newRow,newCol,curr.time+1));
                        maxTime = Math.max(curr.time+1,maxTime);
                    }
            }

        }
         for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
         }
return maxTime;
    }
}