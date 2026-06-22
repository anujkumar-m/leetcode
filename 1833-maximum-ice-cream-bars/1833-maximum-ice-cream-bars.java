class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int n : costs){
            if(n <= coins){
                count++;
                coins -= n;
            }
        }
        return count;
    }
}