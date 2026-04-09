class Pair{
    int x;
    int val;
    Pair(int x, int val){
        this.x = x;
        this.val = val;
    }
}

class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.val - a.val);
        int max = Integer.MIN_VALUE;
        for(int[] a : points){
            int x = a[0];
            int y = a[1];

            while(!pq.isEmpty() && x - pq.peek().x > k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                max = Math.max(max, y + pq.peek().val + x);
            }
            pq.offer(new Pair(x, y - x));
        }
        return max;
    }
}