class Solution {
    public int minKBitFlips(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<>();
        int flip = 0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            
            if(!q.isEmpty() && q.peek() < i - k + 1){
                q.poll();
            }
            int curr = nums[i];
            if(q.size() % 2 != 0){
                curr = 1 - curr;
            }

            if(curr == 0){
                if(i+k > n) return -1;

                q.offer(i);
                flip++;
            }
        }
        return flip;
    }
}