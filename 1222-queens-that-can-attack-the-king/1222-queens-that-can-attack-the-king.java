class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] board = new boolean[8][8];
        for (int[] q : queens) {
            board[q[0]][q[1]] = true;
        }
        int[] rDir = { -1, 1, 0, 0, 1, -1, -1, 1 };
        int[] cDir = { 0, 0, -1, 1, 1, -1, 1, -1 };
        for (int i = 0; i < 8; i++) {
            int r = king[0];
            int c = king[1];

            while (true) {
                r += rDir[i];
                c += cDir[i];

                if (r < 0 || c < 0 || r >= 8 || c >= 8)
                    break;

                if (board[r][c]) {
                    ans.add(Arrays.asList(r, c));
                    break;
                }
            }
        }
        return ans;
    }
}