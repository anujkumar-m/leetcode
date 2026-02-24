class Solution {
    public void bfs(int[][] isConnected, int src, boolean[] vis) {
        //vis[src] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        int n = isConnected.length;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int i = 0; i < n; i++) {
                if (isConnected[curr][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int size = isConnected.length;
        boolean vis[] = new boolean[size+1];
        for(int i = 0; i < size ; i++){
            if(!vis[i]){
                count++;
                bfs(isConnected,i,vis);
            }
        }
        return count;
    }
}