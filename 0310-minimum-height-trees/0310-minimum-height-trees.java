class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1) return Arrays.asList(0);

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0;i < n ;i++){
            graph.add(new ArrayList<>());
        }
        int[] degree = new int[n];
        for(int[] num : edges){
            int ai = num[0];
            int bi = num[1];
            graph.get(ai).add(bi);
            graph.get(bi).add(ai);
            degree[ai]++;
            degree[bi]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ;i < n ;i++){
            if(degree[i] == 1){
                queue.offer(i);
            }
        }
        int nodes = n;
        while(nodes > 2){
        nodes -= queue.size();
        int size = queue.size();
        for(int i = 0; i < size; i++){
            int curr = queue.poll();
            for(int neighbor : graph.get(curr)){
                degree[neighbor]--;

                if(degree[neighbor] == 1) queue.add(neighbor);
            }
        } 
        }
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            ans.add(queue.poll());
        }

        return ans;
    }
}