class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++){
            q.add(i);
        }

        int times = 0;
        while(!q.isEmpty()){
            times++;
            int front = q.poll();

            tickets[front]--;

            if(k == front && tickets[front] == 0){
                return times;
            }
            if(tickets[front] != 0) q.add(front);

        }
        return times;
    }
}