class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int []arr:accounts){
            int sum=0;
            for(int n:arr){
                sum+=n;
                if(sum>max) max=sum;
            }
        }
        return max;
    }
}