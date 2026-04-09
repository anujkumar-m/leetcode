class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b)->
        {
            if(a[0] != b[0]) return b[0]-a[0];
            return a[1]-b[1];
        }
        );

        for(int[] n : properties){
            pq.offer(n);
        }
        int maxDefense = 0;
        int weak = 0;
        while(!pq.isEmpty()){
            int[] n = pq.poll();
            int defense = n[1];

            if(defense < maxDefense) weak++;

            maxDefense = Math.max(defense, maxDefense);
        }
        return weak;
    }
}