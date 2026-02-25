import java.util.*;

class Solution {

    public int[] findOrder(int n, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[n];

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];

            adj.get(prereq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            ans.add(curr);

            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (ans.size() != n) {
            return new int[0];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}